package com.example.song.controller;

import com.example.song.dto.SongDto;
import com.example.song.model.Song;
import com.example.song.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SongController {

    @Autowired
    ISongService songService;

    @GetMapping("/")
    public String getPageHome(Model model, @PageableDefault(page = 0, size = 5) Pageable pageable) {
        model.addAttribute("songs", songService.findAll(pageable));
        model.addAttribute("songDto", new SongDto());
        return "/home";
    }

    @PostMapping("/create")
    private String saveSong(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult,
                            RedirectAttributes redirectAttributes, Model model,
                            @PageableDefault(page = 0, size = 5) Pageable pageable) {
        new SongDto().validate(songDto, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("songs", songService.findAll(pageable));
            model.addAttribute("songDto", songDto);
            model.addAttribute("hasError", "true");
            return "/home";
        }

        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        songService.save(song);
        redirectAttributes.addFlashAttribute("mess", "Thêm bài hát mới thành công");
        return "redirect:/";
    }

    @PostMapping("/edit")
    private String editSong(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult,
                            RedirectAttributes redirectAttributes, Model model,
                            @PageableDefault(page = 0, size = 5) Pageable pageable) {
        new SongDto().validate(songDto, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("songs", songService.findAll(pageable));
            model.addAttribute("songDto", songDto);
            model.addAttribute("hasError1", "true");
            return "/home";
        }

        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        songService.update(song);
        redirectAttributes.addFlashAttribute("mess", "Chỉnh sửa bài hát mới thành công");
        return "redirect:/";
    }
}
