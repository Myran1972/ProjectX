PRAGMA foreign_keys=ON;
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS StaffStatus (Status TEXT UNIQUE);
INSERT INTO StaffStatus VALUES ('100%');
INSERT INTO StaffStatus VALUES ('50%');
INSERT INTO StaffStatus VALUES ('Sjuk');
INSERT INTO StaffStatus VALUES ('VAB');
INSERT INTO StaffStatus VALUES ('Studier');
INSERT INTO StaffStatus VALUES ('Semester');
COMMIT;