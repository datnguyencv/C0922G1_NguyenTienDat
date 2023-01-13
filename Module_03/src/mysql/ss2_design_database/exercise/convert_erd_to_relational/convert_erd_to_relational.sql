create database convert_erd_to_relational;

use convert_erd_to_relational;

CREATE TABLE phieu_xuat (
    so_px INT PRIMARY KEY,
    ngay_xuat DATETIME
);

CREATE TABLE vat_tu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(50)
);
    
CREATE TABLE chi_tiet_phieu_xuat (
    so_px INT,
    ma_vat_tu INT,
    don_gia_xuat VARCHAR(50),
    so_luong_xuat VARCHAR(50),
    PRIMARY KEY (so_px , ma_vat_tu),
    FOREIGN KEY (so_px)
	REFERENCES phieu_xuat (so_px),
    FOREIGN KEY (ma_vat_tu)
	REFERENCES vat_tu (ma_vat_tu)
);
    
CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY,
    ngay_nhap DATETIME
);

    
CREATE TABLE chi_tiet_phieu_nhap (
    ma_vat_tu INT,
    so_phieu_nhap INT,
    don_gia_nhap INT,
    so_luong_nhap INT,
    PRIMARY KEY (ma_vat_tu , so_phieu_nhap),
    FOREIGN KEY (ma_vat_tu)
	REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_phieu_nhap)
	REFERENCES phieu_nhap (so_phieu_nhap)
);
    
CREATE TABLE nha_cung_cap (
    ma_ncc INT PRIMARY KEY,
    ten_ncc VARCHAR(50),
    dia_chi VARCHAR(50)
);
    
CREATE TABLE so_dien_thoai (
    so_dien_thoai INT PRIMARY KEY,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc)
        REFERENCES nha_cung_cap (ma_ncc)
);
    
CREATE TABLE don_dat_hang (
    so_don_hang INT PRIMARY KEY,
    ngay_don_hang DATETIME,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc)
	REFERENCES nha_cung_cap (ma_ncc)
);
 
CREATE TABLE chi_tiet_don_dat_hang (
    so_don_hang INT,
    ma_vat_tu INT,
    PRIMARY KEY (so_don_hang , ma_vat_tu),
    FOREIGN KEY (so_don_hang)
	REFERENCES don_dat_hang (so_don_hang),
    FOREIGN KEY (ma_vat_tu)
	REFERENCES vat_tu (ma_vat_tu)
);
    
    