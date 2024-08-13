INSERT INTO `COMPANY` (`CP_PK`, `CP_NAME`) VALUES
('CP001', 'Toyota'),
('CP002', 'Ford'),
('CP003', 'BMW'),
('CP004', 'Hyundai'),
('CP005', 'Tesla');

INSERT INTO `CAR_NAME` (`CN_PK`, `CAR_NAME`) VALUES
('CN001', 'Corolla'),
('CN002', 'Mustang'),
('CN003', 'X5'),
('CN004', 'Elantra'),
('CN005', 'Model S');

INSERT INTO `MODEL_YEAR` (`YEAR_PK`, `DATE_YEAR`) VALUES
('YEAR001', '2019'),
('YEAR002', '2020'),
('YEAR003', '2021'),
('YEAR004', '2022'),
('YEAR005', '2023');

INSERT INTO `CAR_INFO` (`CI_PK`, `CP_FK`, `CN_FK`, `YEAR_FK`) VALUES
('CI001', 'CP001', 'CN001', 'YEAR001'),
('CI002', 'CP002', 'CN002', 'YEAR002'),
('CI003', 'CP003', 'CN003', 'YEAR003'),
('CI004', 'CP004', 'CN004', 'YEAR004'),
('CI005', 'CP005', 'CN005', 'YEAR005'),
('CI006', 'CP001', 'CN002', 'YEAR003'),
('CI007', 'CP002', 'CN001', 'YEAR004'),
('CI008', 'CP003', 'CN004', 'YEAR005'),
('CI009', 'CP004', 'CN003', 'YEAR001'),
('CI010', 'CP005', 'CN002', 'YEAR002');

INSERT INTO `OPTIONS` (`OP_PK`, `OPTION`) VALUES
('OP001', 'Sunroof'),
('OP002', 'Leather Seats'),
('OP003', 'Bluetooth'),
('OP004', 'Backup Camera'),
('OP005', 'Navigation System'),
('OP006', 'Heated Seats'),
('OP007', 'Alloy Wheels'),
('OP008', 'Blind Spot Monitor'),
('OP009', 'Remote Start'),
('OP010', 'Keyless Entry');

INSERT INTO `CAR_INFO_OPTIONS` (`CI_OP_PK`, `OP_FK`, `CI_FK`) VALUES
('CIOP001', 'OP001', 'CI001'),
('CIOP002', 'OP002', 'CI002'),
('CIOP003', 'OP003', 'CI003'),
('CIOP004', 'OP004', 'CI004'),
('CIOP005', 'OP005', 'CI005'),
('CIOP006', 'OP006', 'CI001'),
('CIOP007', 'OP007', 'CI002'),
('CIOP008', 'OP008', 'CI003'),
('CIOP009', 'OP009', 'CI004'),
('CIOP010', 'OP010', 'CI005'),
('CIOP011', 'OP002', 'CI006'),
('CIOP012', 'OP004', 'CI007'),
('CIOP013', 'OP006', 'CI008'),
('CIOP014', 'OP008', 'CI009'),
('CIOP015', 'OP010', 'CI010');





