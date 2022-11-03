let heartlink=null;
    heartlink=document.getElementById('heartImage');
function init() {
    heartlink=document.getElementById('heartImage');
    heartlink.style.position='relative';
    heartlink.style.left='0px';
}
function moveRight() {
    heartlink.style.left= parseInt(heartlink.style.left)+ 10 + 'px';
}
window.onload=init;


