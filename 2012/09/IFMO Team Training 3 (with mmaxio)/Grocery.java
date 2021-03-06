package mypackage;

import math.MathUtils;
import niyazio.FastScanner;
import niyazio.FastPrinter;

import java.util.*;

public class Grocery {
    static int[] d = MathUtils.getFactoringSieve(20000001);

    static int[][] ANSWERS = {{100, 150, 168, 275, },
{16, 250, 500, 766, },
{20, 175, 478, 1000, },
{55, 100, 225, 1600, },
{25, 120, 500, 1290, },
{61, 70, 400, 750, },
{25, 250, 310, 624, },
{16, 230, 625, 670, },
{92, 100, 250, 340, },
{25, 225, 275, 960, },
{120, 125, 180, 250, },
{25, 176, 472, 625, },
{50, 100, 375, 600, },
{15, 200, 725, 800, },
{50, 128, 375, 395, },
{75, 100, 232, 550, },
{100, 100, 124, 1350, },
{25, 100, 680, 1150, },
{100, 100, 140, 850, },
{10, 400, 450, 1075, },
{68, 100, 300, 450, },
{64, 95, 280, 625, },
{22, 240, 270, 1250, },
{25, 240, 375, 512, },
{55, 100, 320, 625, },
{100, 130, 150, 400, },
{63, 125, 175, 960, },
{70, 80, 250, 1000, },
{40, 100, 445, 750, },
{26, 150, 368, 1250, },
{40, 65, 750, 900, },
{112, 120, 125, 525, },
{40, 100, 375, 1030, },
{85, 100, 256, 375, },
{52, 125, 375, 384, },
{22, 165, 625, 640, },
{40, 150, 345, 500, },
{45, 120, 300, 750, },
{40, 165, 250, 700, },
{75, 125, 260, 320, },
{30, 100, 704, 750, },
{28, 160, 325, 1125, },
{16, 200, 690, 750, },
{75, 135, 200, 400, },
{96, 125, 175, 360, },
{34, 200, 240, 750, },
{100, 100, 130, 1100, },
{50, 135, 200, 1100, },
{50, 60, 520, 1125, },
{50, 120, 375, 436, },
{14, 300, 500, 740, },
{50, 130, 240, 750, },
{32, 125, 500, 657, },
{35, 160, 328, 625, },
{8, 500, 629, 750, },
{50, 65, 500, 984, },
{25, 160, 400, 975, },
{100, 100, 125, 1300, },
{65, 130, 250, 400, },
{22, 250, 368, 625, },
{12, 300, 500, 1015, },
{125, 125, 128, 378, },
{28, 250, 250, 704, },
{50, 88, 436, 625, },
{16, 347, 400, 625, },
{30, 125, 420, 1000, },
{15, 192, 625, 1040, },
{25, 182, 340, 1000, },
{25, 192, 450, 575, },
{42, 200, 204, 625, },
{40, 180, 350, 375, },
{16, 375, 400, 565, },
{28, 150, 400, 850, },
{64, 100, 250, 690, },
{50, 80, 500, 630, },
{22, 200, 484, 625, },
{100, 100, 148, 725, },
{25, 120, 625, 880, },
{48, 142, 250, 625, },
{16, 195, 625, 880, },
{81, 110, 200, 500, },
{92, 100, 150, 900, },
{80, 125, 125, 1320, },
{100, 100, 120, 1600, },
{125, 140, 186, 200, },
{40, 134, 340, 625, },
{30, 195, 320, 625, },
{80, 80, 225, 875, },
{48, 80, 425, 875, },
{12, 290, 525, 1000, },
{24, 255, 320, 625, },
{25, 128, 625, 778, },
{50, 120, 234, 1000, },
{100, 100, 150, 700, },
{10, 450, 500, 768, },
{69, 80, 250, 1050, },
{35, 150, 250, 1392, },
{69, 125, 250, 384, },
{40, 100, 380, 1000, },
{48, 131, 250, 750, },
{48, 170, 250, 450, },
{100, 127, 160, 375, },
{52, 70, 425, 1000, },
{60, 150, 300, 300, },
{80, 150, 240, 250, },
{25, 106, 625, 1152, },
{36, 100, 550, 700, },
{56, 75, 375, 880, },
{40, 198, 200, 750, },
{70, 75, 250, 1264, },
{84, 100, 160, 1000, },
{8, 450, 620, 875, },
{12, 250, 631, 1000, },
{35, 250, 274, 400, },
{37, 156, 250, 1000, },
{65, 100, 250, 664, },
{100, 125, 160, 385, },
{25, 183, 448, 625, },
{50, 75, 392, 1100, },
{55, 125, 178, 1600, },
{80, 126, 250, 300, },
{25, 100, 820, 900, },
{32, 180, 250, 1050, },
{50, 70, 400, 1300, },
{50, 108, 375, 520, },
{50, 170, 200, 600, },
{40, 68, 750, 825, },
{100, 100, 250, 300, },
{60, 100, 375, 428, },
{25, 160, 395, 1000, },
{75, 100, 300, 380, },
{78, 80, 270, 625, },
{60, 108, 260, 625, },
{50, 100, 300, 900, },
{53, 100, 250, 1240, },
{48, 130, 210, 1250, },
{50, 200, 275, 300, },
{48, 120, 250, 950, },
{20, 162, 500, 1100, },
{10, 375, 600, 788, },
{22, 250, 300, 880, },
{20, 224, 500, 600, },
{30, 176, 250, 1425, },
{65, 125, 180, 800, },
{12, 500, 500, 506, },
{40, 160, 275, 625, },
{100, 105, 125, 1056, },
{55, 100, 250, 1080, },
{46, 120, 240, 1250, },
{25, 170, 432, 750, },
{28, 140, 400, 1000, },
{80, 120, 165, 625, },
{15, 340, 375, 800, },
{43, 210, 250, 400, },
{50, 118, 225, 1200, },
{48, 150, 250, 560, },
{25, 112, 625, 1016, },
{100, 105, 120, 1250, },
{20, 160, 625, 805, },
{19, 215, 400, 1000, },
{31, 175, 250, 1280, },
{40, 125, 300, 930, },
{25, 192, 305, 1125, },
{75, 94, 200, 900, },
{30, 125, 560, 650, },
{59, 80, 350, 750, },
{50, 170, 272, 375, },
{42, 200, 200, 650, },
{65, 120, 164, 1250, },
{40, 95, 375, 1200, },
{30, 200, 225, 1300, },
{50, 75, 580, 600, },
{50, 130, 250, 688, },
{30, 240, 250, 650, },
{16, 285, 330, 1250, },
{8, 592, 625, 625, },
{72, 150, 150, 600, },
{26, 175, 448, 625, },
{25, 168, 500, 630, },
{36, 100, 396, 1250, },
{80, 125, 150, 710, },
{10, 372, 625, 760, },
{60, 75, 500, 508, },
{20, 300, 300, 775, },
{30, 216, 250, 800, },
{20, 125, 836, 900, },
{25, 100, 750, 1000, },
{32, 250, 310, 400, },
{18, 240, 450, 750, },
{30, 200, 375, 484, },
{100, 140, 196, 250, },
{14, 375, 460, 600, },
{106, 125, 208, 250, },
{60, 125, 300, 388, },
{60, 120, 230, 625, },
{16, 250, 370, 1325, },
{29, 240, 375, 400, },
{20, 280, 370, 625, },
{28, 100, 625, 1004, },
{30, 186, 400, 500, },
{30, 185, 250, 1200, },
{75, 88, 225, 800, },
{25, 192, 300, 1175, },
{40, 181, 240, 625, },
{30, 176, 260, 1250, },
{45, 60, 650, 1000, },
{24, 210, 280, 1250, },
{25, 250, 305, 640, },
{40, 130, 250, 1400, },
{88, 100, 250, 365, },
{50, 180, 250, 384, },
{25, 219, 320, 750, },
{15, 320, 480, 625, },
{8, 445, 625, 880, },
{85, 98, 250, 400, },
{20, 234, 400, 750, },
{76, 110, 250, 400, },
{100, 175, 190, 200, },
{25, 124, 500, 1180, },
{64, 76, 375, 625, },
{24, 125, 500, 1298, },
{8, 480, 625, 795, },
{50, 80, 350, 1200, },
{94, 100, 168, 625, },
{50, 80, 345, 1250, },
{25, 201, 480, 500, },
{45, 80, 600, 625, },
{35, 125, 350, 960, },
{80, 125, 200, 405, },
{15, 250, 576, 725, },
{119, 125, 150, 320, },
{25, 160, 540, 625, },
{17, 400, 400, 475, },
{80, 110, 144, 1250, },
{44, 125, 285, 800, },
{65, 96, 375, 400, },
{25, 224, 325, 700, },
{56, 98, 375, 500, },
{24, 250, 250, 1048, },
{15, 204, 520, 1250, },
{30, 250, 340, 400, },
{45, 125, 400, 456, },
{16, 295, 480, 625, },
{40, 109, 500, 550, },
{25, 280, 322, 500, },
{59, 64, 550, 625, },
{50, 156, 200, 725, },
{16, 328, 425, 625, },
{25, 200, 268, 1450, },
{49, 100, 325, 800, },
{100, 100, 160, 600, },
{50, 144, 234, 625, },
{30, 130, 400, 1000, },
{52, 125, 214, 1000, },
{50, 150, 240, 550, },
{25, 148, 520, 750, },
{30, 92, 560, 1250, },
{28, 150, 336, 1250, },
{20, 300, 410, 500, },
{44, 144, 250, 750, },
{16, 250, 375, 1282, },
{120, 125, 140, 350, },
{80, 120, 125, 1625, },
{48, 62, 500, 1250, },
{51, 100, 420, 500, },
{25, 130, 500, 1048, },
{11, 400, 415, 1000, },
{75, 80, 375, 424, },
{45, 92, 480, 625, },
{84, 100, 260, 375, },
{16, 200, 625, 841, },
{85, 100, 158, 1000, },
{32, 250, 250, 532, },
{40, 125, 346, 700, },
{48, 230, 250, 300, },
{45, 200, 250, 396, },
{56, 90, 425, 500, },
{25, 208, 375, 640, },
{64, 125, 282, 375, },
{48, 110, 250, 1275, },
{14, 250, 550, 880, },
{16, 190, 550, 1125, },
{25, 235, 250, 1088, },
{70, 120, 250, 400, },
{14, 250, 624, 750, },
{32, 151, 400, 625, },
{10, 375, 650, 720, },
{50, 60, 500, 1220, },
{85, 116, 160, 625, },
{40, 151, 220, 1250, },
{32, 100, 630, 750, },
{40, 75, 500, 1230, },
{50, 120, 250, 840, },
{67, 200, 220, 250, },
{100, 120, 170, 375, },
{50, 100, 325, 760, },
{30, 200, 400, 450, },
{78, 100, 200, 675, },
{40, 250, 256, 350, },
{25, 120, 675, 800, },
{60, 85, 352, 625, },
{25, 115, 608, 1000, },
{48, 150, 181, 1250, },
{37, 120, 375, 800, },
{25, 268, 288, 625, },
{46, 102, 400, 625, },
{25, 190, 500, 520, },
{15, 340, 448, 625, },
{25, 256, 302, 625, },
{28, 125, 550, 760, },
{15, 275, 375, 1216, },
{25, 134, 450, 1200, },
{57, 144, 200, 625, },
{32, 162, 250, 1500, },
{25, 190, 280, 1500, },
{100, 125, 141, 480, },
{48, 88, 375, 875, },
{88, 96, 150, 1250, },
{110, 150, 200, 200, },
{18, 280, 500, 525, },
{22, 172, 600, 625, },
{50, 150, 176, 1175, },
{43, 130, 320, 625, },
{20, 264, 300, 1000, },
{50, 200, 200, 450, },
{16, 238, 400, 1250, },
{50, 150, 175, 1200, },
{70, 112, 250, 450, },
{30, 125, 400, 1110, },
{25, 142, 400, 1350, },
{70, 130, 176, 625, },
{16, 225, 600, 725, },
{25, 200, 285, 1200, },
{50, 160, 250, 460, },
{25, 100, 800, 925, },
{25, 225, 256, 1150, },
{40, 168, 300, 500, },
{74, 100, 225, 600, },
{24, 142, 625, 700, },
{20, 128, 825, 875, },
{45, 65, 512, 1250, },
{70, 80, 310, 625, },
{66, 100, 250, 640, },
{50, 158, 240, 500, },
{40, 100, 500, 640, },
{50, 125, 260, 696, },
{50, 128, 204, 1250, },
{80, 125, 225, 344, },
{50, 90, 500, 512, },
{114, 120, 200, 250, },
{32, 100, 625, 757, },
{20, 239, 375, 800, },
{25, 200, 370, 700, },
{25, 128, 645, 750, },
{36, 190, 300, 500, },
{64, 130, 195, 625, },
{100, 118, 240, 250, },
{50, 128, 200, 1350, },
{16, 250, 379, 1250, },
{50, 80, 450, 725, },
{25, 100, 736, 1025, },
{36, 200, 246, 625, },
{30, 80, 750, 1075, },
{30, 230, 375, 400, },
{24, 225, 368, 625, },
{16, 250, 550, 680, },
{48, 65, 470, 1250, },
{48, 65, 525, 1000, },
{15, 250, 450, 1040, },
{10, 400, 550, 800, },
{55, 64, 620, 625, },
{25, 275, 288, 600, },
{20, 250, 400, 670, },
{30, 150, 500, 544, },
{25, 205, 400, 600, },
{25, 250, 280, 740, },
{25, 310, 350, 400, },
{10, 360, 625, 796, },
{40, 65, 625, 1168, },
{13, 235, 625, 960, },
{40, 163, 375, 400, },
{35, 125, 320, 1200, },
{75, 80, 250, 810, },
{36, 100, 500, 795, },
{40, 120, 350, 750, },
{64, 65, 375, 900, },
{15, 250, 600, 692, },
{25, 175, 320, 1300, },
{44, 120, 375, 550, },
{40, 190, 228, 625, },
{30, 190, 240, 1250, },
{21, 125, 800, 860, },
{100, 100, 225, 340, },
{24, 150, 575, 700, },
{50, 60, 650, 800, },
{25, 180, 500, 564, },
{90, 125, 200, 332, },
{38, 100, 480, 750, },
{25, 125, 520, 1072, },
{24, 132, 475, 1250, },
{50, 118, 250, 880, },
{25, 250, 360, 508, },
{10, 460, 584, 625, },
{100, 100, 175, 500, },
{75, 125, 192, 490, },
{77, 80, 210, 1250, },
{100, 128, 175, 325, },
{15, 224, 525, 1000, },
{30, 95, 625, 960, },
{50, 80, 375, 1010, },
{85, 125, 175, 448, },
{18, 160, 750, 800, },
{10, 312, 750, 800, },
{47, 140, 300, 500, },
{13, 300, 525, 800, },
{46, 100, 400, 650, },
{54, 100, 328, 625, },
{65, 125, 200, 624, },
{63, 160, 160, 625, },
{60, 100, 300, 575, },
{50, 240, 250, 270, },
{25, 320, 360, 375, },
{100, 120, 235, 250, },
{22, 125, 675, 960, },
{40, 139, 250, 1100, },
{25, 175, 400, 800, },
{54, 125, 250, 624, },
{40, 120, 282, 1250, },
{80, 125, 222, 350, },
{25, 200, 300, 1050, },
{16, 170, 750, 900, },
{125, 160, 175, 184, },
{8, 410, 750, 800, },
{64, 150, 200, 450, },
{50, 72, 392, 1250, },
{26, 112, 750, 750, },
{64, 100, 375, 385, },
{16, 214, 625, 750, },
{20, 250, 325, 952, },
{25, 115, 625, 960, },
{25, 150, 600, 620, },
{40, 175, 286, 500, },
{25, 140, 466, 1000, },
{53, 88, 400, 625, },
{75, 150, 200, 340, },
{50, 140, 200, 975, },
{30, 200, 250, 960, },
{10, 375, 512, 975, },
{10, 500, 555, 600, },
{40, 160, 250, 750, },
{96, 120, 125, 775, },
{100, 100, 220, 350, },
{16, 256, 575, 625, },
{50, 144, 250, 555, },
{48, 50, 750, 1060, },
{41, 100, 375, 960, },
{25, 93, 875, 960, },
{42, 70, 625, 880, },
{25, 192, 375, 740, },
{26, 195, 300, 1000, },
{40, 125, 273, 1200, },
{9, 375, 600, 960, },
{40, 70, 544, 1250, },
{40, 100, 350, 1225, },
{45, 50, 876, 1000, },
{60, 100, 400, 400, },
{50, 120, 335, 500, },
{8, 438, 625, 900, },
{30, 200, 246, 1000, },
{40, 250, 250, 360, },
{100, 100, 180, 475, },
{50, 80, 440, 750, },
{15, 250, 460, 1000, },
{10, 400, 625, 690, },
{25, 135, 500, 960, },
{30, 112, 435, 1250, },
{20, 200, 485, 750, },
{48, 118, 250, 1000, },
{120, 125, 129, 400, },
{11, 285, 625, 960, },
{30, 120, 400, 1250, },
{18, 250, 400, 835, },
{40, 100, 510, 625, },
{15, 317, 320, 1250, },
{50, 100, 312, 825, },
{20, 348, 350, 500, },
{26, 208, 250, 1375, },
{42, 100, 472, 625, },
{32, 225, 252, 625, },
{24, 130, 625, 820, },
{35, 80, 546, 1250, },
{10, 350, 544, 1000, },
{70, 175, 240, 250, },
{10, 319, 625, 960, },
{14, 300, 400, 1050, },
{40, 90, 604, 625, },
{40, 100, 328, 1500, },
{36, 135, 280, 1250, },
{72, 125, 275, 320, },
{20, 250, 388, 700, },
{90, 100, 250, 352, },
{52, 100, 250, 1340, },
{25, 265, 375, 448, },
{42, 60, 725, 1000, },
{35, 100, 625, 640, },
{60, 100, 204, 1625, },
{50, 72, 375, 1420, },
{50, 125, 240, 830, },
{50, 60, 625, 840, },
{50, 75, 350, 1520, },
{35, 250, 300, 360, },
{50, 75, 400, 1050, },
{15, 300, 500, 652, },
{64, 125, 175, 910, },
{32, 125, 375, 1064, },
{20, 312, 330, 625, },
{10, 322, 600, 1000, },
{11, 300, 570, 1000, },
{12, 260, 600, 1000, },
{15, 240, 430, 1250, },
{40, 125, 400, 565, },
{16, 250, 594, 625, },
{50, 60, 555, 1000, },
{50, 156, 250, 480, },
{50, 160, 192, 750, },
{75, 125, 160, 720, },
{60, 80, 278, 1250, },
{16, 175, 625, 1088, },
{60, 152, 200, 500, },
{20, 200, 350, 1425, },
{30, 175, 250, 1456, },
{16, 290, 490, 625, },
{30, 120, 620, 625, },
{30, 75, 884, 1000, },
{40, 230, 250, 400, },
{25, 128, 550, 925, },
{82, 100, 220, 500, },
{10, 285, 700, 1000, },
{9, 490, 625, 640, },
{40, 70, 625, 980, },
{36, 75, 750, 840, },
{64, 127, 200, 625, },
{25, 192, 421, 625, },
{18, 375, 376, 500, },
{40, 140, 322, 625, },
{60, 125, 175, 1152, },
{25, 150, 475, 832, },
{40, 225, 250, 412, },
{20, 240, 302, 1250, },
{16, 250, 400, 1110, },
{20, 250, 450, 576, },
{50, 75, 475, 768, },
{70, 100, 250, 560, },
{60, 160, 169, 625, },
{60, 100, 225, 1100, },
{50, 50, 800, 900, },
{64, 100, 202, 1250, },
{50, 100, 340, 700, },
{30, 175, 248, 1500, },
{40, 75, 692, 750, },
{16, 360, 385, 625, },
{75, 78, 300, 600, },
{40, 100, 406, 875, },
{64, 100, 200, 1300, },
{15, 165, 800, 1000, },
{36, 100, 375, 1460, },
{40, 150, 238, 1000, },
{40, 112, 375, 775, },
{73, 100, 224, 625, },
{16, 250, 465, 850, },
{40, 100, 550, 575, },
{40, 200, 250, 490, },
{62, 150, 225, 400, },
{100, 105, 250, 280, },
{48, 94, 300, 1250, },
{29, 250, 256, 625, },
{34, 70, 800, 1000, },
{30, 175, 400, 550, },
{47, 100, 310, 1000, },
{25, 250, 276, 760, },
{25, 300, 300, 500, },
{25, 175, 448, 675, },
{25, 148, 608, 625, },
{20, 150, 585, 1000, },
{96, 125, 125, 692, },
{50, 125, 320, 495, },
{40, 96, 400, 1000, },
{20, 157, 550, 1000, },
{75, 100, 175, 1120, },
{47, 60, 625, 960, },
{45, 100, 500, 516, },
{25, 225, 400, 520, },
{48, 175, 250, 430, },
{15, 200, 625, 960, },
{40, 80, 625, 745, },
{40, 125, 325, 784, },
{74, 120, 180, 625, },
{15, 283, 400, 1000, },
{16, 225, 426, 1250, },
{25, 122, 600, 900, },
{16, 178, 625, 1050, },
{32, 85, 625, 1060, },
{64, 75, 382, 625, },
{10, 400, 500, 910, },
{16, 165, 750, 950, },
{75, 125, 128, 1640, },
{30, 200, 260, 875, },
{65, 116, 200, 750, },
{25, 208, 280, 1125, },
{30, 250, 300, 464, },
{35, 125, 384, 800, },
{25, 200, 450, 540, },
{10, 396, 475, 1000, },
{20, 225, 500, 596, },
{60, 100, 232, 1000, },
{80, 100, 186, 750, },
{100, 150, 200, 225, },
{70, 125, 150, 1104, },
{50, 125, 227, 960, },
{60, 125, 197, 800, },
{22, 120, 625, 1180, },
{48, 250, 250, 274, },
{102, 112, 250, 250, },
{50, 112, 285, 750, },
{30, 160, 288, 1250, },
{30, 125, 600, 604, },
{21, 215, 320, 1250, },
{54, 160, 250, 400, },
{40, 150, 375, 452, },
{25, 170, 400, 850, },
{35, 200, 225, 800, },
{50, 144, 170, 1625, },
{75, 100, 200, 750, },
{15, 175, 800, 900, },
{25, 240, 400, 475, },
{42, 240, 250, 350, },
{100, 144, 190, 250, },
{120, 125, 150, 316, },
{30, 125, 384, 1225, },
{96, 111, 125, 1000, },
{16, 190, 520, 1250, },
{32, 120, 555, 625, },
{25, 172, 320, 1375, },
{10, 400, 580, 750, },
{20, 125, 800, 945, },
{75, 75, 400, 440, },
{8, 550, 625, 676, },
{100, 160, 170, 250, },
{75, 147, 160, 500, },
{32, 135, 500, 575, },
{100, 120, 144, 500, },
{50, 100, 400, 550, },
{61, 92, 250, 1000, },
{25, 250, 260, 856, },
{50, 90, 400, 675, },
{25, 232, 336, 625, },
{64, 144, 175, 625, },
{35, 200, 294, 500, },
{26, 96, 750, 1000, },
{79, 100, 250, 440, },
{80, 150, 150, 475, },
{50, 63, 464, 1250, },
{80, 146, 150, 500, },
{80, 145, 250, 250, },
{50, 99, 440, 500, },
{20, 250, 300, 1140, },
{70, 125, 238, 400, },
{25, 125, 640, 790, },
{50, 200, 225, 380, },
{40, 150, 250, 880, },
{25, 160, 500, 685, },
{58, 200, 225, 300, },
{80, 136, 145, 625, },
{32, 125, 525, 620, },
{50, 70, 448, 1000, },
{15, 250, 400, 1330, },
{50, 100, 250, 1600, },
{50, 130, 192, 1500, },
{50, 150, 300, 400, },
{45, 85, 400, 1000, },
{25, 160, 424, 875, },
{16, 326, 375, 750, },
{117, 125, 160, 300, },
{22, 250, 400, 560, },
{100, 100, 200, 400, },
{100, 125, 202, 280, },
{16, 300, 410, 750, },
{20, 200, 500, 720, },
{25, 240, 290, 750, },
{75, 100, 195, 800, },
{75, 114, 150, 1200, },
{10, 425, 625, 640, },
{30, 85, 624, 1250, },
{25, 225, 240, 1400, },
{25, 125, 508, 1120, },
{100, 125, 130, 568, },
{8, 420, 750, 775, },
{50, 68, 440, 1125, },
{22, 250, 250, 1392, },
{75, 80, 231, 1000, },
{80, 90, 250, 525, },
{25, 125, 696, 720, },
{14, 240, 470, 1250, },
{80, 125, 161, 600, },
{75, 128, 185, 500, },
{75, 125, 168, 640, },
{20, 250, 294, 1200, },
{25, 184, 400, 725, },
{58, 61, 400, 1250, },
{46, 64, 625, 875, },
{50, 125, 294, 560, },
{112, 125, 144, 375, },
{50, 125, 210, 1232, },
{12, 250, 650, 960, },
{80, 100, 150, 1650, },
{20, 138, 625, 1080, },
{20, 200, 375, 1190, },
{23, 250, 268, 1000, },
{25, 250, 334, 560, },
{40, 115, 416, 625, },
{46, 60, 750, 800, },
{75, 176, 200, 275, },
{54, 125, 184, 1500, },
{20, 180, 500, 875, },
{35, 125, 300, 1472, },
{25, 100, 775, 960, },
{21, 250, 400, 610, },
{26, 232, 250, 1000, },
{25, 240, 250, 1030, },
{60, 142, 250, 400, },
{45, 150, 350, 400, },
{49, 80, 520, 625, },
{52, 75, 500, 660, },
{85, 120, 125, 1200, },
{13, 280, 625, 720, },
{50, 125, 360, 428, },
{50, 112, 250, 1030, },
{22, 136, 625, 900, },
{10, 400, 514, 875, },
{40, 64, 625, 1215, },
{25, 100, 700, 1100, },
{100, 110, 121, 1000, },
{10, 300, 750, 848, },
{25, 225, 300, 800, },
{25, 218, 250, 1360, },
{25, 150, 408, 1100, },
{50, 127, 220, 1000, },
{20, 200, 438, 875, },
{75, 125, 240, 352, },
{35, 120, 480, 625, },
{50, 100, 256, 1450, },
{75, 120, 240, 375, },
{50, 150, 200, 800, },
{25, 204, 260, 1500, },
{24, 250, 387, 500, },
{60, 150, 250, 368, },
{100, 150, 150, 320, },
{68, 100, 244, 625, },
{25, 240, 253, 1000, },
{25, 200, 325, 880, },
{23, 240, 250, 1350, },
{22, 240, 375, 650, },
{100, 125, 180, 324, },
{100, 120, 130, 625, },
{30, 144, 470, 625, },
{50, 140, 276, 500, },
{50, 88, 450, 600, },
{60, 63, 500, 700, },
{50, 100, 450, 480, },
{30, 220, 280, 625, },
{50, 110, 240, 1250, },
{50, 50, 650, 1200, },
{80, 131, 200, 375, },
{64, 125, 250, 439, },
{15, 375, 400, 632, },
{10, 300, 655, 1000, },
{92, 100, 172, 625, },
{60, 60, 596, 625, },
{60, 80, 300, 1000, },
{96, 100, 125, 1605, },
{64, 110, 235, 625, },
{25, 160, 375, 1120, },
{22, 175, 420, 1000, },
{50, 100, 270, 1200, },
{70, 100, 268, 500, },
{60, 100, 250, 820, },
{10, 484, 500, 700, },
{10, 400, 470, 1000, },
{8, 540, 625, 690, },
{40, 250, 295, 300, },
{25, 190, 324, 1000, },
{30, 200, 365, 500, },
{80, 88, 250, 550, },
{30, 100, 565, 1000, },
{25, 247, 250, 960, },
{48, 90, 500, 550, },
{20, 300, 375, 556, },
{30, 200, 280, 750, },
{50, 105, 250, 1296, },
{20, 205, 544, 625, },
{12, 250, 725, 840, },
{26, 125, 650, 720, },
{40, 204, 250, 475, },
{60, 125, 200, 770, },
{18, 298, 400, 625, },
{59, 208, 250, 250, },
{20, 250, 435, 600, },
{112, 150, 160, 250, },
{37, 200, 325, 400, },
{25, 250, 256, 885, },
{25, 250, 392, 460, },
{32, 125, 360, 1175, },
{100, 112, 130, 750, },
{88, 175, 180, 250, },
{50, 125, 200, 1500, },
{55, 100, 300, 700, },
{16, 250, 422, 1000, },
{30, 110, 625, 720, },
{10, 310, 625, 1008, },
{16, 250, 450, 895, },
{50, 149, 320, 375, },
{30, 125, 450, 880, },
{27, 125, 560, 800, },
{14, 300, 368, 1250, },
{76, 106, 200, 625, },
{40, 178, 250, 600, },
{60, 60, 500, 775, },
{25, 250, 400, 450, },
{20, 250, 280, 1375, },
{20, 150, 736, 750, },
{20, 180, 625, 660, },
{32, 165, 425, 500, },
{15, 192, 750, 825, },
{35, 81, 625, 960, },
{42, 64, 625, 1075, },
{64, 100, 263, 625, },
{15, 200, 750, 772, },
{50, 80, 326, 1500, },
{25, 150, 400, 1150, },
{40, 87, 625, 640, },
{76, 125, 250, 328, },
{80, 100, 250, 430, },
{43, 125, 250, 1216, },
{50, 133, 256, 625, },
{60, 130, 175, 1000, },
{125, 125, 192, 221, },
{104, 125, 140, 450, },
{80, 80, 300, 500, },
{40, 84, 575, 750, },
{25, 132, 625, 736, },
{25, 125, 480, 1260, },
{80, 175, 202, 250, },
{75, 90, 280, 500, },
{20, 196, 580, 625, },
{16, 176, 625, 1075, },
{55, 120, 256, 625, },
{14, 360, 500, 575, },
{10, 478, 560, 625, },
{10, 375, 550, 880, },
{50, 60, 688, 750, },
{56, 100, 250, 1015, },
{25, 220, 250, 1320, },
{11, 400, 592, 625, },
{25, 200, 336, 825, },
{30, 180, 275, 1000, },
{28, 213, 250, 1000, },
{30, 150, 400, 725, },
{50, 200, 240, 350, },
{60, 200, 250, 255, },
{113, 125, 200, 240, },
{70, 100, 200, 925, },
{75, 125, 145, 960, },
{75, 120, 250, 356, },
{20, 225, 480, 625, },
{75, 129, 250, 320, },
{15, 240, 625, 704, },
{50, 190, 240, 375, },
{40, 175, 250, 620, },
{31, 100, 600, 850, },
{30, 100, 500, 1260, },
{35, 100, 454, 1000, },
{25, 120, 716, 750, },
{25, 275, 400, 400, },
{40, 100, 400, 900, },
{95, 120, 125, 800, },
{25, 125, 555, 960, },
{20, 140, 564, 1250, },
{50, 80, 402, 875, },
{40, 220, 250, 425, },
{75, 125, 140, 1088, },
{34, 250, 285, 400, },
{52, 120, 200, 1500, },
{70, 78, 240, 1250, },
{70, 100, 195, 1000, },
{10, 400, 525, 850, },
{60, 100, 260, 750, },
{60, 64, 535, 625, },
{25, 250, 320, 595, },
{38, 125, 290, 1200, },
{25, 166, 512, 625, },
{50, 64, 625, 739, },
{19, 125, 832, 1000, },
{70, 200, 208, 250, },
{25, 280, 300, 550, },
{48, 125, 250, 846, },
{25, 256, 355, 500, },
{60, 100, 330, 500, },
{15, 256, 625, 640, },
{28, 200, 250, 1195, },
{64, 67, 450, 625, },
{50, 175, 250, 400, },
{34, 145, 300, 1000, },
{70, 76, 250, 1200, },
{100, 115, 248, 250, },
{25, 185, 288, 1500, },
{42, 136, 250, 1000, },
{100, 120, 200, 300, },
{87, 100, 140, 1500, },
{48, 120, 305, 625, },
{15, 263, 500, 800, },
{16, 250, 508, 750, },
{100, 120, 125, 690, },
{50, 232, 250, 280, },
{85, 100, 200, 550, },
{15, 250, 560, 750, },
{25, 170, 375, 960, },
{25, 111, 640, 1000, },
{50, 50, 720, 1025, },
{40, 140, 250, 1075, },
{48, 55, 625, 1120, },
{64, 188, 250, 250, },
{16, 235, 550, 750, },
{30, 125, 512, 725, },
{20, 171, 440, 1250, },
{50, 68, 560, 750, },
{27, 200, 300, 850, },
{48, 105, 250, 1550, },
{44, 125, 375, 512, },
{40, 125, 450, 492, },
{45, 95, 320, 1250, },
{40, 152, 250, 850, },
{25, 200, 400, 625, },
{29, 100, 625, 928, },
{50, 100, 280, 1075, },
{10, 320, 625, 955, },
{74, 75, 400, 450, },
{20, 255, 500, 500, },
{32, 125, 435, 800, },
{12, 250, 584, 1125, },
};
    static class Pair {
        int sum;
        int product;
        Pair e;

        Pair(int sum, int product) {
            this.sum = sum;
            this.product = product;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "sum=" + sum +
                    ", product=" + product +
                    ", e=" + e +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (product != pair.product) return false;
            if (sum != pair.sum) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = sum;
            result = 31 * result + product;
            return result;
        }
    }

    static class Answer {
        int[] a;

        Answer(int[] a) {
            this.a = a;
            Arrays.sort(a);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Answer answer = (Answer) o;

            if (!Arrays.equals(a, answer.a)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return a != null ? Arrays.hashCode(a) : 0;
        }
    }

    static Map<Integer, List<Pair>> pairsSet;
    static Map<Pair, Pair> allSet;
    static Set<Answer> answersSet;

    public void solve(int testNumber, FastScanner in, FastPrinter out) {
        int n = (int) Math.round(in.nextDouble() * 100);
        for (int[] a : ANSWERS) {
            int sum = a[0] + a[1] + a[2] + a[3];
            if (sum <= n) {
                out.println(p(a[0]) + " " + p(a[1]) + " " + p(a[2]) + " " + p(a[3]));
            }
        }
    }

    static String p(int x) {
        return x / 100 + "." + String.format("%02d", x % 100);
    }

    public void solve2(int testNumber, FastScanner in, FastPrinter out) {
        String s = in.next().replaceAll("\\.", "");
        int n = 2000;
        int[] primes = new int[50];
        int[] pows = new int[50];
        pairsSet = new HashMap<Integer, List<Pair>>();
        allSet = new HashMap<Pair, Pair>();
        answersSet = new HashSet<Answer>();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i + j <= n) {
                    Pair ab = new Pair(i, j);
                    List<Pair> z = pairsSet.get(i * j);
                    if (z == null) {
                        z = new ArrayList<Pair>(1);
                        pairsSet.put(i * j, z);
                    }
                    Pair val = new Pair(i + j, j * i);
                    val.e = ab;
                    z.add(val);
                    if (i == 175 && j == 184) {
                        System.err.println(val);
                    }
                    allSet.put(val, ab);
                }
            }
        }
        for (int sum = 1; sum <= n; sum++) {
            int m = sum * 10000;
            int cur = 0;
            for (int i = m; i > 1; ) {
                int count = 0;
                int p = d[i];
                while (i > 1 && i % p == 0) {
                    i /= p;
                    ++count;
                }
                primes[cur] = p;
                pows[cur] = count;
                ++cur;
            }
            go(0, cur, primes, pows, sum, 1);
        }
        for (Answer e : answersSet) {
            System.out.print("{");
            for (int i : e.a) {
                System.out.print(i + ", ");
            }
            System.out.println("},");
        }
    }

    static void go(int x, int primesCount, int[] primes, int[] pows, int sum, int d) {
        if (x == primesCount) {
            List<Pair> z = pairsSet.get(d);

            if (z == null) {
                return;
            }
            for (Pair f : z) {
                if (f.sum > sum) {
                    continue;
                }
                int otherSum = sum - f.sum;
                int otherProduct = (int) ((long) sum * 1000000 / d);
                Pair got = allSet.get(new Pair(otherSum, otherProduct));
                if (got != null) {
                    answersSet.add(new Answer(new int[]{f.e.sum, f.e.product, got.sum, got.product}));
                }
            }
            return;
        }
        for (int i = 0; i <= pows[x]; i++) {
            go(x + 1, primesCount, primes, pows, sum, d);
            d *= primes[x];
        }
    }
}
