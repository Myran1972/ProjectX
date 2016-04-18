PRAGMA foreign_keys=ON;
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS Ships(ID INTEGER PRIMARY KEY, Name TEXT NOT NULL, Company TEXT NOT NULL, VolumeType TEXT, FOREIGN KEY(VolumeType) REFERENCES TypeTable(VolumeType));
INSERT INTO Ships VALUES ('1','Talane','Minyx','A005');
INSERT INTO Ships VALUES ('2','Zoomcast','Vidoo','AA07');
INSERT INTO Ships VALUES ('3','Buzzster','DabZ','B005');
INSERT INTO Ships VALUES ('4','Kimia','Zoombox','BB07');
INSERT INTO Ships VALUES ('5','Tagtune','Chatterbridge','C005');
INSERT INTO Ships VALUES ('6','Thoughtstorm','Topicstorm','CC07');
INSERT INTO Ships VALUES ('7','Dazzlesphere','Photobug','CCC5');
INSERT INTO Ships VALUES ('8','Jetpulse','Cogibox','K007');
INSERT INTO Ships VALUES ('9','Tazz','Eayo','A005');
INSERT INTO Ships VALUES ('10','Topicware','Kaymbo','AA07');
INSERT INTO Ships VALUES ('11','Quimba','Youspan','B005');
INSERT INTO Ships VALUES ('12','Jaxspan','Skipfire','BB07');
INSERT INTO Ships VALUES ('13','Yodel','Kamba','C005');
INSERT INTO Ships VALUES ('14','Skinte','Twitterbridge','CC07');
INSERT INTO Ships VALUES ('15','Trunyx','Topdrive','CCC5');
INSERT INTO Ships VALUES ('16','Skimia','Nlounge','K007');
INSERT INTO Ships VALUES ('17','Mynte','Wordware','A005');
INSERT INTO Ships VALUES ('18','Yozio','Innotype','AA07');
INSERT INTO Ships VALUES ('19','Skidoo','Edgewire','B005');
INSERT INTO Ships VALUES ('20','Abatz','Thoughtbeat','BB07');
INSERT INTO Ships VALUES ('21','Fivespan','Flashspan','C005');
INSERT INTO Ships VALUES ('22','Wordpedia','Divape','CC07');
INSERT INTO Ships VALUES ('23','Jazzy','Yambee','CCC5');
INSERT INTO Ships VALUES ('24','Avaveo','Gigazoom','K007');
INSERT INTO Ships VALUES ('25','Mydo','Blognation','A005');
INSERT INTO Ships VALUES ('26','Kaymbo','Ozu','AA07');
INSERT INTO Ships VALUES ('27','Viva','Babbleset','B005');
INSERT INTO Ships VALUES ('28','Zoomlounge','Muxo','BB07');
INSERT INTO Ships VALUES ('29','Latz','Oodoo','C005');
INSERT INTO Ships VALUES ('30','Dabfeed','Quatz','CC07');
INSERT INTO Ships VALUES ('31','Skaboo','Wikizz','CCC5');
INSERT INTO Ships VALUES ('32','Chatterbridge','Jayo','K007');
INSERT INTO Ships VALUES ('33','Vimbo','Devcast','A005');
INSERT INTO Ships VALUES ('34','Quaxo','Flashdog','AA07');
INSERT INTO Ships VALUES ('35','Bubbletube','Shuffledrive','B005');
INSERT INTO Ships VALUES ('36','Jabbersphere','Flashspan','BB07');
INSERT INTO Ships VALUES ('37','Zazio','Twitterlist','C005');
INSERT INTO Ships VALUES ('38','Wikizz','Realcube','CC07');
INSERT INTO Ships VALUES ('39','Topiczoom','Skalith','CCC5');
INSERT INTO Ships VALUES ('40','Realblab','Tagchat','K007');
INSERT INTO Ships VALUES ('41','JumpXS','Youbridge','A005');
INSERT INTO Ships VALUES ('42','Edgeclub','Wikibox','AA07');
INSERT INTO Ships VALUES ('43','Katz','Yakijo','B005');
INSERT INTO Ships VALUES ('44','Lazz','Yodoo','BB07');
INSERT INTO Ships VALUES ('45','Zooxo','LiveZ','C005');
INSERT INTO Ships VALUES ('46','Yodoo','Feednation','CC07');
INSERT INTO Ships VALUES ('47','Eayo','Reallinks','CCC5');
INSERT INTO Ships VALUES ('48','Topiclounge','Babblestorm','K007');
INSERT INTO Ships VALUES ('49','Skimia','Linktype','A005');
INSERT INTO Ships VALUES ('50','Trilith','Brainlounge','AA07');
INSERT INTO Ships VALUES ('51','Demivee','Devbug','B005');
INSERT INTO Ships VALUES ('52','Devpoint','Dablist','BB07');
INSERT INTO Ships VALUES ('53','Eidel','Pixonyx','C005');
INSERT INTO Ships VALUES ('54','Browsezoom','Tagopia','CC07');
INSERT INTO Ships VALUES ('55','Twitternation','Skipfire','CCC5');
INSERT INTO Ships VALUES ('56','Jabbercube','Kimia','K007');
INSERT INTO Ships VALUES ('57','Rhynyx','Voolith','A005');
INSERT INTO Ships VALUES ('58','Feednation','Mydeo','AA07');
INSERT INTO Ships VALUES ('59','Fiveclub','Vinte','B005');
INSERT INTO Ships VALUES ('60','Photospace','Leenti','BB07');
INSERT INTO Ships VALUES ('61','Wordpedia','Rhynoodle','C005');
INSERT INTO Ships VALUES ('62','Devbug','Minyx','CC07');
INSERT INTO Ships VALUES ('63','Miboo','Podcat','CCC5');
INSERT INTO Ships VALUES ('64','Thoughtsphere','Buzzbean','K007');
INSERT INTO Ships VALUES ('65','Shuffledrive','Skipfire','A005');
INSERT INTO Ships VALUES ('66','Quinu','Tagfeed','AA07');
INSERT INTO Ships VALUES ('67','Kimia','Zooxo','B005');
INSERT INTO Ships VALUES ('68','Geba','Tazz','BB07');
INSERT INTO Ships VALUES ('69','Meedoo','Skilith','C005');
INSERT INTO Ships VALUES ('70','Flashdog','Wikivu','CC07');
INSERT INTO Ships VALUES ('71','Eimbee','Yadel','CCC5');
INSERT INTO Ships VALUES ('72','Eayo','Trupe','K007');
INSERT INTO Ships VALUES ('73','Yadel','Pixonyx','A005');
INSERT INTO Ships VALUES ('74','Skinte','Devify','AA07');
INSERT INTO Ships VALUES ('75','Eimbee','Quatz','B005');
INSERT INTO Ships VALUES ('76','Fadeo','Yodo','BB07');
INSERT INTO Ships VALUES ('77','Jabberbean','Skilith','C005');
INSERT INTO Ships VALUES ('78','Izio','Einti','CC07');
INSERT INTO Ships VALUES ('79','Topicware','Dabjam','CCC5');
INSERT INTO Ships VALUES ('80','InnoZ','Tagpad','K007');
INSERT INTO Ships VALUES ('81','Centizu','Tagopia','A005');
INSERT INTO Ships VALUES ('82','Zazio','Photolist','AA07');
INSERT INTO Ships VALUES ('83','Zooveo','Realmix','B005');
INSERT INTO Ships VALUES ('84','Livefish','Oodoo','BB07');
INSERT INTO Ships VALUES ('85','Feedbug','Quaxo','C005');
INSERT INTO Ships VALUES ('86','Thoughtbeat','Skyba','CC07');
INSERT INTO Ships VALUES ('87','Skipstorm','Einti','CCC5');
INSERT INTO Ships VALUES ('88','Jayo','Tagtune','K007');
INSERT INTO Ships VALUES ('89','Kaymbo','Eadel','A005');
INSERT INTO Ships VALUES ('90','Npath','Avaveo','AA07');
INSERT INTO Ships VALUES ('91','Realpoint','Jaxspan','B005');
INSERT INTO Ships VALUES ('92','Kazu','Digitube','BB07');
INSERT INTO Ships VALUES ('93','Dynazzy','Gigazoom','C005');
INSERT INTO Ships VALUES ('94','Yozio','Camimbo','CC07');
INSERT INTO Ships VALUES ('95','Twitterworks','Browsecat','CCC5');
INSERT INTO Ships VALUES ('96','Oyoyo','Yodoo','K007');
INSERT INTO Ships VALUES ('97','Camido','Centimia','A005');
INSERT INTO Ships VALUES ('98','Dynava','Youspan','AA07');
INSERT INTO Ships VALUES ('99','Ailane','Realcube','B005');
INSERT INTO Ships VALUES ('100','Tagopia','Tavu','BB07');
INSERT INTO Ships VALUES ('101','Mycat','Tekfly','C005');
INSERT INTO Ships VALUES ('102','Zooxo','Trudeo','CC07');
INSERT INTO Ships VALUES ('103','Zazio','Zooveo','CCC5');
INSERT INTO Ships VALUES ('104','Edgeify','Skyba','K007');
INSERT INTO Ships VALUES ('105','Youopia','Gabspot','A005');
INSERT INTO Ships VALUES ('106','InnoZ','Skaboo','AA07');
INSERT INTO Ships VALUES ('107','Skajo','Feednation','B005');
INSERT INTO Ships VALUES ('108','Zoomdog','Zoozzy','BB07');
INSERT INTO Ships VALUES ('109','Kamba','Vipe','C005');
INSERT INTO Ships VALUES ('110','Brainlounge','Trudoo','CC07');
INSERT INTO Ships VALUES ('111','Realcube','Zoovu','CCC5');
INSERT INTO Ships VALUES ('112','Skinte','Yakijo','K007');
INSERT INTO Ships VALUES ('113','Zoombox','Centimia','A005');
INSERT INTO Ships VALUES ('114','Trilith','Livefish','AA07');
INSERT INTO Ships VALUES ('115','Twimbo','Eabox','B005');
INSERT INTO Ships VALUES ('116','Voonte','Ainyx','BB07');
INSERT INTO Ships VALUES ('117','LiveZ','Kimia','C005');
INSERT INTO Ships VALUES ('118','Mynte','Skippad','CC07');
INSERT INTO Ships VALUES ('119','Voolith','Thoughtstorm','CCC5');
INSERT INTO Ships VALUES ('120','Jaxworks','BlogXS','K007');
INSERT INTO Ships VALUES ('121','Pixonyx','Fatz','A005');
INSERT INTO Ships VALUES ('122','Topicshots','Wordtune','AA07');
INSERT INTO Ships VALUES ('123','Brightdog','Tavu','B005');
INSERT INTO Ships VALUES ('124','Photobug','Edgewire','BB07');
INSERT INTO Ships VALUES ('125','Jamia','Twitternation','C005');
INSERT INTO Ships VALUES ('126','Jabbersphere','Leenti','CC07');
INSERT INTO Ships VALUES ('127','Kimia','Kwideo','CCC5');
INSERT INTO Ships VALUES ('128','Tazz','Jabberstorm','K007');
INSERT INTO Ships VALUES ('129','Meejo','Camimbo','A005');
INSERT INTO Ships VALUES ('130','Roodel','Skilith','AA07');
INSERT INTO Ships VALUES ('131','Skipstorm','Yakitri','B005');
INSERT INTO Ships VALUES ('132','Lazzy','Brainverse','BB07');
INSERT INTO Ships VALUES ('133','Twitterlist','Voomm','C005');
INSERT INTO Ships VALUES ('134','Buzzbean','Fiveclub','CC07');
INSERT INTO Ships VALUES ('135','Vimbo','Skynoodle','CCC5');
INSERT INTO Ships VALUES ('136','Flipbug','Wordify','K007');
INSERT INTO Ships VALUES ('137','Zoomcast','Brainverse','A005');
INSERT INTO Ships VALUES ('138','Edgeblab','Tanoodle','AA07');
INSERT INTO Ships VALUES ('139','Quimba','Zoomdog','B005');
INSERT INTO Ships VALUES ('140','Thoughtstorm','Aimbo','BB07');
INSERT INTO Ships VALUES ('141','Digitube','Einti','C005');
INSERT INTO Ships VALUES ('142','Eidel','Skivee','CC07');
INSERT INTO Ships VALUES ('143','Chatterbridge','Brainbox','CCC5');
INSERT INTO Ships VALUES ('144','Rooxo','Kazu','K007');
INSERT INTO Ships VALUES ('145','Rhynoodle','Trilith','A005');
INSERT INTO Ships VALUES ('146','Babbleopia','Mybuzz','AA07');
INSERT INTO Ships VALUES ('147','Jetwire','Skinder','B005');
INSERT INTO Ships VALUES ('148','Ntags','Voolith','BB07');
INSERT INTO Ships VALUES ('149','Browsedrive','Mycat','C005');
INSERT INTO Ships VALUES ('150','Voonte','Kwideo','CC07');
INSERT INTO Ships VALUES ('151','Trilia','Babblestorm','CCC5');
INSERT INTO Ships VALUES ('152','Flashspan','Thoughtblab','K007');
INSERT INTO Ships VALUES ('153','Tagpad','Meemm','A005');
INSERT INTO Ships VALUES ('154','Layo','Flashset','AA07');
INSERT INTO Ships VALUES ('155','Voomm','Skilith','B005');
INSERT INTO Ships VALUES ('156','Yodoo','Agivu','BB07');
INSERT INTO Ships VALUES ('157','Photobug','Topiczoom','C005');
INSERT INTO Ships VALUES ('158','Chatterbridge','Ntags','CC07');
INSERT INTO Ships VALUES ('159','Flipbug','Twitterworks','CCC5');
INSERT INTO Ships VALUES ('160','Thoughtstorm','Pixope','K007');
INSERT INTO Ships VALUES ('161','Jabbertype','Rhynoodle','A005');
INSERT INTO Ships VALUES ('162','Avavee','Roomm','AA07');
INSERT INTO Ships VALUES ('163','Eidel','Devpoint','B005');
INSERT INTO Ships VALUES ('164','Cogibox','Realbridge','BB07');
INSERT INTO Ships VALUES ('165','Teklist','Fivespan','C005');
INSERT INTO Ships VALUES ('166','Feednation','Devshare','CC07');
INSERT INTO Ships VALUES ('167','Reallinks','Kazio','CCC5');
INSERT INTO Ships VALUES ('168','Yata','Miboo','K007');
INSERT INTO Ships VALUES ('169','Youopia','Teklist','A005');
INSERT INTO Ships VALUES ('170','Rhynoodle','Brainlounge','AA07');
INSERT INTO Ships VALUES ('171','Shufflester','Meezzy','B005');
INSERT INTO Ships VALUES ('172','Demizz','Flipopia','BB07');
INSERT INTO Ships VALUES ('173','Aimbo','Wordware','C005');
INSERT INTO Ships VALUES ('174','Zoomcast','Thoughtstorm','CC07');
INSERT INTO Ships VALUES ('175','Skimia','Agivu','CCC5');
INSERT INTO Ships VALUES ('176','Meemm','Pixonyx','K007');
INSERT INTO Ships VALUES ('177','Dynabox','Quaxo','A005');
INSERT INTO Ships VALUES ('178','Skyvu','Plajo','AA07');
INSERT INTO Ships VALUES ('179','Realbridge','Pixope','B005');
INSERT INTO Ships VALUES ('180','Eadel','Yodo','BB07');
INSERT INTO Ships VALUES ('181','Blogspan','Zoovu','C005');
INSERT INTO Ships VALUES ('182','Voonder','Quire','CC07');
INSERT INTO Ships VALUES ('183','Skaboo','Skiba','CCC5');
INSERT INTO Ships VALUES ('184','Browseblab','Skalith','K007');
INSERT INTO Ships VALUES ('185','Layo','Chatterbridge','A005');
INSERT INTO Ships VALUES ('186','Digitube','Mydo','AA07');
INSERT INTO Ships VALUES ('187','Yakitri','Gigaclub','B005');
INSERT INTO Ships VALUES ('188','Topdrive','Yodoo','BB07');
INSERT INTO Ships VALUES ('189','Dynabox','Yombu','C005');
INSERT INTO Ships VALUES ('190','Brainlounge','Rhyloo','CC07');
INSERT INTO Ships VALUES ('191','Avaveo','Skibox','CCC5');
INSERT INTO Ships VALUES ('192','Oba','Gigashots','K007');
INSERT INTO Ships VALUES ('193','Buzzster','Meevee','A005');
INSERT INTO Ships VALUES ('194','Feedmix','Quatz','AA07');
INSERT INTO Ships VALUES ('195','Flashpoint','Skaboo','B005');
INSERT INTO Ships VALUES ('196','Yotz','Rhynoodle','BB07');
INSERT INTO Ships VALUES ('197','Gigabox','Youtags','C005');
INSERT INTO Ships VALUES ('198','Kimia','Mynte','CC07');
INSERT INTO Ships VALUES ('199','Fanoodle','Dabfeed','CCC5');
INSERT INTO Ships VALUES ('200','Zoovu','Yodoo','K007');
INSERT INTO Ships VALUES ('201','Meedoo','Zoonder','A005');
INSERT INTO Ships VALUES ('202','Riffwire','Fadeo','AA07');
INSERT INTO Ships VALUES ('203','Gabcube','Oozz','B005');
INSERT INTO Ships VALUES ('204','Chatterpoint','Buzzster','BB07');
INSERT INTO Ships VALUES ('205','Twitterbeat','Realblab','C005');
INSERT INTO Ships VALUES ('206','Devshare','Ntag','CC07');
INSERT INTO Ships VALUES ('207','Wikido','Flipopia','CCC5');
INSERT INTO Ships VALUES ('208','Zooxo','Skippad','K007');
INSERT INTO Ships VALUES ('209','Zava','Zoombox','A005');
INSERT INTO Ships VALUES ('210','Gigabox','Twimbo','AA07');
INSERT INTO Ships VALUES ('211','Jabbertype','Gigashots','B005');
INSERT INTO Ships VALUES ('212','Twitternation','Lazz','BB07');
INSERT INTO Ships VALUES ('213','Meevee','Photobug','C005');
INSERT INTO Ships VALUES ('214','Brightdog','Gabtype','CC07');
INSERT INTO Ships VALUES ('215','Digitube','Quimm','CCC5');
INSERT INTO Ships VALUES ('216','Realmix','Youopia','K007');
INSERT INTO Ships VALUES ('217','Browseblab','Skyble','A005');
INSERT INTO Ships VALUES ('218','Dynazzy','Agimba','AA07');
INSERT INTO Ships VALUES ('219','Twitterbridge','Livepath','B005');
INSERT INTO Ships VALUES ('220','Jaxworks','Gigazoom','BB07');
INSERT INTO Ships VALUES ('221','Browsecat','Vipe','C005');
INSERT INTO Ships VALUES ('222','Thoughtbridge','Yabox','CC07');
INSERT INTO Ships VALUES ('223','Skippad','Zoomzone','CCC5');
INSERT INTO Ships VALUES ('224','Snaptags','Oozz','K007');
INSERT INTO Ships VALUES ('225','Yodel','Flashset','A005');
INSERT INTO Ships VALUES ('226','Flashpoint','Eabox','AA07');
INSERT INTO Ships VALUES ('227','Flipstorm','Leexo','B005');
INSERT INTO Ships VALUES ('228','Ooba','Oodoo','BB07');
INSERT INTO Ships VALUES ('229','Twinder','Leenti','C005');
INSERT INTO Ships VALUES ('230','Kimia','Skilith','CC07');
INSERT INTO Ships VALUES ('231','Eimbee','Twitterwire','CCC5');
INSERT INTO Ships VALUES ('232','Zoomdog','Jabbertype','K007');
INSERT INTO Ships VALUES ('233','Mycat','Gabtune','A005');
INSERT INTO Ships VALUES ('234','Zoovu','Minyx','AA07');
INSERT INTO Ships VALUES ('235','Zoozzy','LiveZ','B005');
INSERT INTO Ships VALUES ('236','Centidel','Bluezoom','BB07');
INSERT INTO Ships VALUES ('237','Yamia','Flashpoint','C005');
INSERT INTO Ships VALUES ('238','Podcat','Flipstorm','CC07');
INSERT INTO Ships VALUES ('239','Agimba','Oyondu','CCC5');
INSERT INTO Ships VALUES ('240','Shuffletag','Youtags','K007');
INSERT INTO Ships VALUES ('241','Einti','Dabshots','A005');
INSERT INTO Ships VALUES ('242','Oyoba','Dynazzy','AA07');
INSERT INTO Ships VALUES ('243','Oozz','Tazz','B005');
INSERT INTO Ships VALUES ('244','Bubblebox','Youspan','BB07');
INSERT INTO Ships VALUES ('245','Divavu','Wordpedia','C005');
INSERT INTO Ships VALUES ('246','Vimbo','Youfeed','CC07');
INSERT INTO Ships VALUES ('247','Avamba','Tagpad','CCC5');
INSERT INTO Ships VALUES ('248','Agivu','Skyvu','K007');
INSERT INTO Ships VALUES ('249','Kwideo','Miboo','A005');
INSERT INTO Ships VALUES ('250','Muxo','Kanoodle','AA07');
INSERT INTO Ships VALUES ('251','Snaptags','Edgepulse','B005');
INSERT INTO Ships VALUES ('252','Cogilith','Zooxo','BB07');
INSERT INTO Ships VALUES ('253','Oodoo','Mybuzz','C005');
INSERT INTO Ships VALUES ('254','Brightdog','Rhybox','CC07');
INSERT INTO Ships VALUES ('255','Photobean','Aibox','CCC5');
INSERT INTO Ships VALUES ('256','Browsetype','Quamba','K007');
INSERT INTO Ships VALUES ('257','Mydo','Flipopia','A005');
INSERT INTO Ships VALUES ('258','Vinte','Avavee','AA07');
INSERT INTO Ships VALUES ('259','Flashspan','Gigashots','B005');
INSERT INTO Ships VALUES ('260','Twinte','Flashdog','BB07');
INSERT INTO Ships VALUES ('261','Ntag','Oloo','C005');
INSERT INTO Ships VALUES ('262','Trilith','InnoZ','CC07');
INSERT INTO Ships VALUES ('263','Buzzbean','Feedfire','CCC5');
INSERT INTO Ships VALUES ('264','Snaptags','Quatz','K007');
INSERT INTO Ships VALUES ('265','Meevee','Jayo','A005');
INSERT INTO Ships VALUES ('266','Yotz','Gevee','AA07');
INSERT INTO Ships VALUES ('267','Kanoodle','Zoomcast','B005');
INSERT INTO Ships VALUES ('268','Divanoodle','Zoomzone','BB07');
INSERT INTO Ships VALUES ('269','Abatz','Feedfire','C005');
INSERT INTO Ships VALUES ('270','Topiczoom','Jabberstorm','CC07');
INSERT INTO Ships VALUES ('271','Kare','Linkbridge','CCC5');
INSERT INTO Ships VALUES ('272','Quimm','Katz','K007');
INSERT INTO Ships VALUES ('273','Npath','Browsedrive','A005');
INSERT INTO Ships VALUES ('274','Bluejam','Blognation','AA07');
INSERT INTO Ships VALUES ('275','Jayo','Browsetype','B005');
INSERT INTO Ships VALUES ('276','Realfire','Fadeo','BB07');
INSERT INTO Ships VALUES ('277','Buzzbean','Skimia','C005');
INSERT INTO Ships VALUES ('278','Youbridge','Voolia','CC07');
INSERT INTO Ships VALUES ('279','Feedfish','Ozu','CCC5');
INSERT INTO Ships VALUES ('280','Jaxworks','Blogspan','K007');
INSERT INTO Ships VALUES ('281','Jabbersphere','Tazz','A005');
INSERT INTO Ships VALUES ('282','Riffpedia','Jaxspan','AA07');
INSERT INTO Ships VALUES ('283','Eimbee','Dabvine','B005');
INSERT INTO Ships VALUES ('284','Kanoodle','Katz','BB07');
INSERT INTO Ships VALUES ('285','Ntags','Voonder','C005');
INSERT INTO Ships VALUES ('286','Dabjam','Nlounge','CC07');
INSERT INTO Ships VALUES ('287','Vitz','Babbleset','CCC5');
INSERT INTO Ships VALUES ('288','Latz','Jetwire','K007');
INSERT INTO Ships VALUES ('289','Twitternation','Cogibox','A005');
INSERT INTO Ships VALUES ('290','Oyondu','Podcat','AA07');
INSERT INTO Ships VALUES ('291','Yodel','Kare','B005');
INSERT INTO Ships VALUES ('292','Plambee','Yozio','BB07');
INSERT INTO Ships VALUES ('293','Camido','Yakijo','C005');
INSERT INTO Ships VALUES ('294','Cogibox','Kimia','CC07');
INSERT INTO Ships VALUES ('295','Innojam','Topdrive','CCC5');
INSERT INTO Ships VALUES ('296','Innotype','Browsebug','K007');
INSERT INTO Ships VALUES ('297','Rhyzio','Agimba','A005');
INSERT INTO Ships VALUES ('298','Livefish','Jayo','AA07');
INSERT INTO Ships VALUES ('299','Flashset','Twitterbridge','B005');
INSERT INTO Ships VALUES ('300','Voonte','Meeveo','BB07');
INSERT INTO Ships VALUES ('301','Bazongale','Jaharada','C005');
INSERT INTO Ships VALUES ('302','Tratomanox','Beezopi','CC07');
INSERT INTO Ships VALUES ('303','Elpis','Karamnio','CCC5');
INSERT INTO Ships VALUES ('304','Agorafix','Flegox','K007');
COMMIT;