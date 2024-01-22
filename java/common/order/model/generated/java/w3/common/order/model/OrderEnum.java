package w3.common.order.model;

import java.lang.String;

public enum OrderEnum {
  ORDER_851970(851970, "smart variant"),

  ORDER_851971(851971, "smart"),

  ORDER_851972(851972, "stop"),

  ORDER_851973(851973, "stunned"),

  ORDER_851974(851974, "?"),

  ORDER_851975(851975, "instant3"),

  ORDER_851976(851976, "cancel"),

  ORDER_851977(851977, "some deprecated cancel?"),

  ORDER_851978(851978, "cancel structure/upgrade of structure"),

  ORDER_851979(851979, null),

  ORDER_851980(851980, "setrally"),

  ORDER_851981(851981, "getitem"),

  ORDER_851982(851982, null),

  ORDER_851983(851983, "attack"),

  ORDER_851984(851984, "attackground"),

  ORDER_851985(851985, "attackonce"),

  ORDER_851986(851986, "move"),

  ORDER_851987(851987, "instant2"),

  ORDER_851988(851988, "AImove"),

  ORDER_851989(851989, ""),

  ORDER_851990(851990, "patrol"),

  ORDER_851991(851991, "instant1"),

  ORDER_851992(851992, ""),

  ORDER_851993(851993, "holdposition"),

  ORDER_851994(851994, "build (enter build menu)"),

  ORDER_851995(851995, "humanbuild (enter build menu)"),

  ORDER_851996(851996, "orcbuild (enter build menu)"),

  ORDER_851997(851997, "nightelfbuild (enter build menu)"),

  ORDER_851998(851998, "undeadbuild (enter build menu)"),

  ORDER_851999(851999, "resumebuild (enter build menu)"),

  ORDER_852000(852000, "skillmenu"),

  ORDER_852001(852001, "dropitem"),

  ORDER_852002(852002, "moveslot1"),

  ORDER_852003(852003, "moveslot2"),

  ORDER_852004(852004, "moveslot3"),

  ORDER_852005(852005, "moveslot4"),

  ORDER_852006(852006, "moveslot5"),

  ORDER_852007(852007, "moveslot6"),

  ORDER_852008(852008, "useslot1"),

  ORDER_852009(852009, "useslot2"),

  ORDER_852010(852010, "useslot3"),

  ORDER_852011(852011, "useslot4"),

  ORDER_852012(852012, "useslot5"),

  ORDER_852013(852013, "useslot6"),

  ORDER_852014(852014, ""),

  ORDER_852015(852015, "detectaoe"),

  ORDER_852016(852016, "poison attack"),

  ORDER_852017(852017, "resumeharvesting"),

  ORDER_852018(852018, "harvest"),

  ORDER_852019(852019, "instant4, harvestlumber?"),

  ORDER_852020(852020, "returnresources"),

  ORDER_852021(852021, "autoharvestgold"),

  ORDER_852022(852022, "autoharvestlumber"),

  ORDER_852023(852023, "neutraldetectaoe"),

  ORDER_852024(852024, "repair"),

  ORDER_852025(852025, "repairon"),

  ORDER_852026(852026, "repairoff"),

  ORDER_852027(852027, "start revive unit 1 (altar)"),

  ORDER_852028(852028, "start revive unit 2 (altar)"),

  ORDER_852029(852029, "start revive unit 3 (altar)"),

  ORDER_852030(852030, "start revive unit 4 (altar)"),

  ORDER_852031(852031, "start revive unit 5 (altar)"),

  ORDER_852032(852032, "start revive unit 6 (altar)"),

  ORDER_852033(852033, "start revive unit 7 (altar)"),

  ORDER_852034(852034, null),

  ORDER_852035(852035, null),

  ORDER_852036(852036, null),

  ORDER_852037(852037, null),

  ORDER_852038(852038, null),

  ORDER_852039(852039, "revive"),

  ORDER_852040(852040, "selfdestruct"),

  ORDER_852041(852041, "selfdestructon"),

  ORDER_852042(852042, "selfdestructoff"),

  ORDER_852043(852043, "board"),

  ORDER_852044(852044, "forceboard"),

  ORDER_852045(852045, ""),

  ORDER_852046(852046, "load"),

  ORDER_852047(852047, "unload"),

  ORDER_852048(852048, "unloadall"),

  ORDER_852049(852049, "unloadallinstant"),

  ORDER_852050(852050, "loadcorpse"),

  ORDER_852051(852051, "loadcorpse on"),

  ORDER_852052(852052, "loadcorpse off"),

  ORDER_852053(852053, "loadcorpseinstant"),

  ORDER_852054(852054, "unloadallcorpses"),

  ORDER_852055(852055, "defend"),

  ORDER_852056(852056, "undefend"),

  ORDER_852057(852057, "dispel"),

  ORDER_852058(852058, ""),

  ORDER_852059(852059, ""),

  ORDER_852060(852060, "flare"),

  ORDER_852061(852061, "gyrocopter bombs"),

  ORDER_852062(852062, "detect (gyrocopter)"),

  ORDER_852063(852063, "heal"),

  ORDER_852064(852064, "healon"),

  ORDER_852065(852065, "healoff"),

  ORDER_852066(852066, "innerfire"),

  ORDER_852067(852067, "innerfireon"),

  ORDER_852068(852068, "innerfireoff"),

  ORDER_852069(852069, "invisibility"),

  ORDER_852070(852070, "detect (magic sentinel)"),

  ORDER_852071(852071, "militiaconvert"),

  ORDER_852072(852072, "militia"),

  ORDER_852073(852073, "militiaoff"),

  ORDER_852074(852074, "polymorph"),

  ORDER_852075(852075, "slow"),

  ORDER_852076(852076, "slowon"),

  ORDER_852077(852077, "slowoff"),

  ORDER_852078(852078, "storm hammers"),

  ORDER_852079(852079, "tankdroppilot"),

  ORDER_852080(852080, "tankloadpilot"),

  ORDER_852081(852081, "tankpilot"),

  ORDER_852082(852082, "townbellon"),

  ORDER_852083(852083, "townbelloff"),

  ORDER_852084(852084, "brilliance aura"),

  ORDER_852085(852085, "devotion aura"),

  ORDER_852086(852086, "avatar"),

  ORDER_852087(852087, "unavatar"),

  ORDER_852088(852088, "bash"),

  ORDER_852089(852089, "blizzard"),

  ORDER_852090(852090, "divineshield"),

  ORDER_852091(852091, "undivineshield"),

  ORDER_852092(852092, "holybolt"),

  ORDER_852093(852093, "massteleport"),

  ORDER_852094(852094, "resurrection"),

  ORDER_852095(852095, "thunderbolt"),

  ORDER_852096(852096, "thunderclap"),

  ORDER_852097(852097, "waterelemental"),

  ORDER_852098(852098, "koto aura"),

  ORDER_852099(852099, "battlestations"),

  ORDER_852100(852100, "berserk"),

  ORDER_852101(852101, "bloodlust"),

  ORDER_852102(852102, "bloodluston"),

  ORDER_852103(852103, "bloodlustoff"),

  ORDER_852104(852104, "devour"),

  ORDER_852105(852105, "evileye"),

  ORDER_852106(852106, "ensnare"),

  ORDER_852107(852107, "ensnareon"),

  ORDER_852108(852108, "ensnareoff"),

  ORDER_852109(852109, "healingward"),

  ORDER_852110(852110, "lightningshield"),

  ORDER_852111(852111, "purge"),

  ORDER_852112(852112, "pillage"),

  ORDER_852113(852113, "standdown"),

  ORDER_852114(852114, "stasistrap"),

  ORDER_852115(852115, "venom spears"),

  ORDER_852116(852116, "pulverize"),

  ORDER_852117(852117, "command aura"),

  ORDER_852118(852118, "endurance aura"),

  ORDER_852119(852119, "chainlightning"),

  ORDER_852120(852120, "critical strike"),

  ORDER_852121(852121, "earthquake"),

  ORDER_852122(852122, "farsight"),

  ORDER_852123(852123, "mirrorimage"),

  ORDER_852124(852124, "reincarnation"),

  ORDER_852125(852125, "shockwave"),

  ORDER_852126(852126, "spiritwolf"),

  ORDER_852127(852127, "stomp"),

  ORDER_852128(852128, "whirlwind"),

  ORDER_852129(852129, "windwalk"),

  ORDER_852130(852130, "unwindwalk"),

  ORDER_852131(852131, "ambush"),

  ORDER_852132(852132, "autodispel"),

  ORDER_852133(852133, "autodispelon"),

  ORDER_852134(852134, "autodispeloff"),

  ORDER_852135(852135, "barkskin"),

  ORDER_852136(852136, "barkskinon"),

  ORDER_852137(852137, "barkskinoff"),

  ORDER_852138(852138, "bearform"),

  ORDER_852139(852139, "unbearform"),

  ORDER_852140(852140, "corrosivebreath"),

  ORDER_852141(852141, "couple (archer), couple (hippogryph)"),

  ORDER_852142(852142, "loadarcher"),

  ORDER_852143(852143, "mounthippogryph"),

  ORDER_852144(852144, "cyclone"),

  ORDER_852145(852145, "detonate"),

  ORDER_852146(852146, "eattree"),

  ORDER_852147(852147, "entangle"),

  ORDER_852148(852148, "entangleinstant"),

  ORDER_852149(852149, "faeriefire"),

  ORDER_852150(852150, "faeriefireon"),

  ORDER_852151(852151, "faeriefireoff"),

  ORDER_852152(852152, "impaling bolt (vorpal blades)"),

  ORDER_852153(852153, "item magic immunity"),

  ORDER_852154(852154, "moon glaive"),

  ORDER_852155(852155, "ravenform"),

  ORDER_852156(852156, "unravenform"),

  ORDER_852157(852157, "recharge"),

  ORDER_852158(852158, "rechargeon"),

  ORDER_852159(852159, "rechargeoff"),

  ORDER_852160(852160, "rejuvination"),

  ORDER_852161(852161, "renew"),

  ORDER_852162(852162, "renewon"),

  ORDER_852163(852163, "renewoff"),

  ORDER_852164(852164, "roar"),

  ORDER_852165(852165, "root"),

  ORDER_852166(852166, "unroot"),

  ORDER_852167(852167, "slow poison"),

  ORDER_852168(852168, ""),

  ORDER_852169(852169, "thorns aura"),

  ORDER_852170(852170, "trueshot aura"),

  ORDER_852171(852171, "entanglingroots"),

  ORDER_852172(852172, "evasion"),

  ORDER_852173(852173, "flamingarrowstarg"),

  ORDER_852174(852174, "flamingarrows"),

  ORDER_852175(852175, "unflamingarrows"),

  ORDER_852176(852176, "forceofnature"),

  ORDER_852177(852177, "immolation"),

  ORDER_852178(852178, "unimmolation"),

  ORDER_852179(852179, "manaburn"),

  ORDER_852180(852180, "metamorphosis"),

  ORDER_852181(852181, "scout"),

  ORDER_852182(852182, "sentinel"),

  ORDER_852183(852183, "starfall"),

  ORDER_852184(852184, "tranquility"),

  ORDER_852185(852185, "acolyteharvest"),

  ORDER_852186(852186, "antimagicshell"),

  ORDER_852187(852187, "blight"),

  ORDER_852188(852188, "cannibalize"),

  ORDER_852189(852189, "cripple"),

  ORDER_852190(852190, "curse"),

  ORDER_852191(852191, "curseon"),

  ORDER_852192(852192, "curseoff"),

  ORDER_852193(852193, "plague aura"),

  ORDER_852194(852194, "plague toss"),

  ORDER_852195(852195, "freezingbreath"),

  ORDER_852196(852196, "possession"),

  ORDER_852197(852197, "raisedead"),

  ORDER_852198(852198, "raisedeadon"),

  ORDER_852199(852199, "raisedeadoff"),

  ORDER_852200(852200, "instant"),

  ORDER_852201(852201, "requestsacrifice"),

  ORDER_852202(852202, "restoration"),

  ORDER_852203(852203, "restorationon"),

  ORDER_852204(852204, "restorationoff"),

  ORDER_852205(852205, "sacrifice"),

  ORDER_852206(852206, "stoneform"),

  ORDER_852207(852207, "unstoneform"),

  ORDER_852208(852208, "detect (shade)"),

  ORDER_852209(852209, "unholyfrenzy"),

  ORDER_852210(852210, "unsummon"),

  ORDER_852211(852211, "web"),

  ORDER_852212(852212, "webon"),

  ORDER_852213(852213, "weboff"),

  ORDER_852214(852214, "wispharvest"),

  ORDER_852215(852215, "auraunholy"),

  ORDER_852216(852216, "auravampiric"),

  ORDER_852217(852217, "animatedead"),

  ORDER_852218(852218, "carrionswarm"),

  ORDER_852219(852219, "darkritual"),

  ORDER_852220(852220, "darksummoning"),

  ORDER_852221(852221, "deathanddecay"),

  ORDER_852222(852222, "deathcoil"),

  ORDER_852223(852223, "deathpact"),

  ORDER_852224(852224, "dreadlordinferno"),

  ORDER_852225(852225, "frostarmor"),

  ORDER_852226(852226, "frostnova"),

  ORDER_852227(852227, "sleep"),

  ORDER_852228(852228, "darkconversion"),

  ORDER_852229(852229, "darkportal"),

  ORDER_852230(852230, "fingerofdeath"),

  ORDER_852231(852231, "firebolt"),

  ORDER_852232(852232, "inferno"),

  ORDER_852233(852233, "gold2lumber"),

  ORDER_852234(852234, "lumber2gold"),

  ORDER_852235(852235, "spies"),

  ORDER_852236(852236, "permanent immolation"),

  ORDER_852237(852237, "rainofchaos"),

  ORDER_852238(852238, "rainoffire"),

  ORDER_852239(852239, "request_hero"),

  ORDER_852240(852240, "disassociate"),

  ORDER_852241(852241, "revenge"),

  ORDER_852242(852242, "soulpreservation"),

  ORDER_852243(852243, "coldarrowstarg"),

  ORDER_852244(852244, "coldarrows"),

  ORDER_852245(852245, "uncoldarrows"),

  ORDER_852246(852246, "creepanimatedead"),

  ORDER_852247(852247, "creepdevour"),

  ORDER_852248(852248, "creepheal"),

  ORDER_852249(852249, "creephealon"),

  ORDER_852250(852250, "creephealoff"),

  ORDER_852251(852251, "creepreincarnation"),

  ORDER_852252(852252, "creepthunderbolt"),

  ORDER_852253(852253, "creepthunderclap"),

  ORDER_852254(852254, "poisonarrowstarg"),

  ORDER_852255(852255, "poisonarrows"),

  ORDER_852256(852256, "unpoisonarrows"),

  ORDER_852257(852257, "agility mod"),

  ORDER_852258(852258, "item animate dead"),

  ORDER_852259(852259, "attack mod"),

  ORDER_852260(852260, "experience mod"),

  ORDER_852261(852261, "figurine summon"),

  ORDER_852262(852262, "intelligence mod"),

  ORDER_852263(852263, "level mod"),

  ORDER_852264(852264, "hp mod"),

  ORDER_852265(852265, "mp mod"),

  ORDER_852266(852266, "strength mod"),

  ORDER_852267(852267, "item command"),

  ORDER_852268(852268, "item damage aoe (goblin landmine)"),

  ORDER_852269(852269, "item defense aoe (scroll of protection)"),

  ORDER_852270(852270, "area detection (crystal ball, arcane tower)"),

  ORDER_852271(852271, "item dispel aoe"),

  ORDER_852272(852272, "item heal"),

  ORDER_852273(852273, "item heal aoe"),

  ORDER_852274(852274, "wandillusion"),

  ORDER_852275(852275, "lightning purge"),

  ORDER_852276(852276, "item mana restore"),

  ORDER_852277(852277, "item mana restore aoe"),

  ORDER_852278(852278, "item place mine (goblin landmine)"),

  ORDER_852279(852279, "item recall"),

  ORDER_852280(852280, ""),

  ORDER_852281(852281, "item restore"),

  ORDER_852282(852282, "item restore aoe"),

  ORDER_852283(852283, "item resurrection"),

  ORDER_852284(852284, "item soul trap"),

  ORDER_852285(852285, "item speed, item speed aoe (scroll of speed)"),

  ORDER_852286(852286, "item town portal"),

  ORDER_852287(852287, "item invisibility"),

  ORDER_852288(852288, "invulnerability potion"),

  ORDER_852289(852289, "item cloak of flames (immolation)"),

  ORDER_852290(852290, "all mod, blight placement (sacrificial skull), passives, detection (also flyer), submerge"),

  ORDER_852291(852291, null),

  ORDER_852292(852292, null),

  ORDER_852293(852293, null),

  ORDER_852294(852294, null),

  ORDER_852295(852295, null),

  ORDER_852296(852296, null),

  ORDER_852297(852297, null),

  ORDER_852298(852298, null),

  ORDER_852299(852299, null),

  ORDER_852300(852300, null),

  ORDER_852301(852301, null),

  ORDER_852302(852302, null),

  ORDER_852303(852303, null),

  ORDER_852304(852304, null),

  ORDER_852305(852305, null),

  ORDER_852306(852306, null),

  ORDER_852307(852307, null),

  ORDER_852308(852308, null),

  ORDER_852309(852309, null),

  ORDER_852310(852310, null),

  ORDER_852311(852311, null),

  ORDER_852312(852312, null),

  ORDER_852313(852313, null),

  ORDER_852314(852314, null),

  ORDER_852315(852315, null),

  ORDER_852316(852316, null),

  ORDER_852317(852317, null),

  ORDER_852318(852318, null),

  ORDER_852319(852319, null),

  ORDER_852320(852320, null),

  ORDER_852321(852321, null),

  ORDER_852322(852322, null),

  ORDER_852323(852323, null),

  ORDER_852324(852324, null),

  ORDER_852325(852325, null),

  ORDER_852326(852326, null),

  ORDER_852327(852327, null),

  ORDER_852328(852328, null),

  ORDER_852329(852329, null),

  ORDER_852330(852330, null),

  ORDER_852331(852331, null),

  ORDER_852332(852332, null),

  ORDER_852333(852333, null),

  ORDER_852334(852334, null),

  ORDER_852335(852335, null),

  ORDER_852336(852336, null),

  ORDER_852337(852337, null),

  ORDER_852338(852338, null),

  ORDER_852339(852339, null),

  ORDER_852340(852340, null),

  ORDER_852341(852341, null),

  ORDER_852342(852342, null),

  ORDER_852343(852343, null),

  ORDER_852344(852344, null),

  ORDER_852345(852345, null),

  ORDER_852346(852346, null),

  ORDER_852347(852347, null),

  ORDER_852348(852348, null),

  ORDER_852349(852349, null),

  ORDER_852350(852350, null),

  ORDER_852351(852351, null),

  ORDER_852352(852352, null),

  ORDER_852353(852353, null),

  ORDER_852354(852354, null),

  ORDER_852355(852355, null),

  ORDER_852356(852356, null),

  ORDER_852357(852357, null),

  ORDER_852358(852358, null),

  ORDER_852359(852359, null),

  ORDER_852360(852360, null),

  ORDER_852361(852361, null),

  ORDER_852362(852362, null),

  ORDER_852363(852363, null),

  ORDER_852364(852364, null),

  ORDER_852365(852365, null),

  ORDER_852366(852366, null),

  ORDER_852367(852367, null),

  ORDER_852368(852368, null),

  ORDER_852369(852369, null),

  ORDER_852370(852370, null),

  ORDER_852371(852371, null),

  ORDER_852372(852372, null),

  ORDER_852373(852373, null),

  ORDER_852374(852374, null),

  ORDER_852375(852375, null),

  ORDER_852376(852376, null),

  ORDER_852377(852377, null),

  ORDER_852378(852378, null),

  ORDER_852379(852379, null),

  ORDER_852380(852380, null),

  ORDER_852381(852381, null),

  ORDER_852382(852382, null),

  ORDER_852383(852383, null),

  ORDER_852384(852384, null),

  ORDER_852385(852385, null),

  ORDER_852386(852386, null),

  ORDER_852387(852387, null),

  ORDER_852388(852388, null),

  ORDER_852389(852389, null),

  ORDER_852390(852390, null),

  ORDER_852391(852391, null),

  ORDER_852392(852392, null),

  ORDER_852393(852393, null),

  ORDER_852394(852394, null),

  ORDER_852395(852395, null),

  ORDER_852396(852396, null),

  ORDER_852397(852397, null),

  ORDER_852398(852398, null),

  ORDER_852399(852399, null),

  ORDER_852400(852400, null),

  ORDER_852401(852401, null),

  ORDER_852402(852402, null),

  ORDER_852403(852403, null),

  ORDER_852404(852404, null),

  ORDER_852405(852405, null),

  ORDER_852406(852406, null),

  ORDER_852407(852407, null),

  ORDER_852408(852408, null),

  ORDER_852409(852409, null),

  ORDER_852410(852410, null),

  ORDER_852411(852411, null),

  ORDER_852412(852412, null),

  ORDER_852413(852413, null),

  ORDER_852414(852414, null),

  ORDER_852415(852415, null),

  ORDER_852416(852416, null),

  ORDER_852417(852417, null),

  ORDER_852418(852418, null),

  ORDER_852419(852419, null),

  ORDER_852420(852420, null),

  ORDER_852421(852421, null),

  ORDER_852422(852422, null),

  ORDER_852423(852423, null),

  ORDER_852424(852424, null),

  ORDER_852425(852425, null),

  ORDER_852426(852426, null),

  ORDER_852427(852427, null),

  ORDER_852428(852428, null),

  ORDER_852429(852429, null),

  ORDER_852430(852430, null),

  ORDER_852431(852431, null),

  ORDER_852432(852432, null),

  ORDER_852433(852433, null),

  ORDER_852434(852434, null),

  ORDER_852435(852435, null),

  ORDER_852436(852436, null),

  ORDER_852437(852437, null),

  ORDER_852438(852438, null),

  ORDER_852439(852439, null),

  ORDER_852440(852440, null),

  ORDER_852441(852441, null),

  ORDER_852442(852442, null),

  ORDER_852443(852443, null),

  ORDER_852444(852444, null),

  ORDER_852445(852445, null),

  ORDER_852446(852446, null),

  ORDER_852447(852447, null),

  ORDER_852448(852448, null),

  ORDER_852449(852449, null),

  ORDER_852450(852450, null),

  ORDER_852451(852451, null),

  ORDER_852452(852452, null),

  ORDER_852453(852453, null),

  ORDER_852454(852454, null),

  ORDER_852455(852455, null),

  ORDER_852456(852456, null),

  ORDER_852457(852457, null),

  ORDER_852458(852458, "frostarmoron"),

  ORDER_852459(852459, "frostarmoroff"),

  ORDER_852460(852460, "?? (can be issued on targets)"),

  ORDER_852461(852461, "slow aura"),

  ORDER_852462(852462, "awaken unit 1 (tavern)"),

  ORDER_852463(852463, "awaken unit 2 (tavern)"),

  ORDER_852464(852464, "awaken unit 3 (tavern)"),

  ORDER_852465(852465, "awaken unit 4 (tavern)"),

  ORDER_852466(852466, "awaken"),

  ORDER_852467(852467, "nagabuild (enter build menu)"),

  ORDER_852468(852468, ""),

  ORDER_852469(852469, "mount"),

  ORDER_852470(852470, "dismount"),

  ORDER_852471(852471, "retrain (tome of retraining)"),

  ORDER_852472(852472, "rocket attack (barrage)"),

  ORDER_852473(852473, "cloudoffog"),

  ORDER_852474(852474, "controlmagic"),

  ORDER_852475(852475, "feedback"),

  ORDER_852476(852476, "flak cannon"),

  ORDER_852477(852477, "frag shards"),

  ORDER_852478(852478, "magicdefense"),

  ORDER_852479(852479, "magicundefense"),

  ORDER_852480(852480, "magicleash (aerial shackles)"),

  ORDER_852481(852481, "phoenixfire"),

  ORDER_852482(852482, "phoenixmorph"),

  ORDER_852483(852483, "spellsteal"),

  ORDER_852484(852484, "spellstealon"),

  ORDER_852485(852485, "spellstealoff"),

  ORDER_852486(852486, "banish"),

  ORDER_852487(852487, "drain"),

  ORDER_852488(852488, "flamestrike"),

  ORDER_852489(852489, "summonphoenix"),

  ORDER_852490(852490, "ancestralspirit"),

  ORDER_852491(852491, "ancestralspirittarget"),

  ORDER_852492(852492, "balls of fire (burning oil)"),

  ORDER_852493(852493, "corporealform"),

  ORDER_852494(852494, "uncorporealform"),

  ORDER_852495(852495, "disenchant"),

  ORDER_852496(852496, "etherealform"),

  ORDER_852497(852497, "unetherealform"),

  ORDER_852498(852498, "liquid fire"),

  ORDER_852499(852499, "spiritlink"),

  ORDER_852500(852500, "unstableconcoction"),

  ORDER_852501(852501, "healingwave"),

  ORDER_852502(852502, "hex"),

  ORDER_852503(852503, "voodoo"),

  ORDER_852504(852504, "ward"),

  ORDER_852505(852505, "autoentangle"),

  ORDER_852506(852506, "autoentangleinstant"),

  ORDER_852507(852507, "coupletarget"),

  ORDER_852508(852508, "coupleinstant"),

  ORDER_852509(852509, "decouple"),

  ORDER_852510(852510, "ethereal"),

  ORDER_852511(852511, "grabtree"),

  ORDER_852512(852512, "manaflareon"),

  ORDER_852513(852513, "manaflareoff"),

  ORDER_852514(852514, "phaseshift"),

  ORDER_852515(852515, "phaseshifton"),

  ORDER_852516(852516, "phaseshiftoff"),

  ORDER_852517(852517, "phaseshiftinstant"),

  ORDER_852518(852518, "resistant skin"),

  ORDER_852519(852519, "hardened skin"),

  ORDER_852520(852520, "taunt"),

  ORDER_852521(852521, "vengeance"),

  ORDER_852522(852522, "vengeanceon"),

  ORDER_852523(852523, "vengeanceoff"),

  ORDER_852524(852524, "vengeanceinstant"),

  ORDER_852525(852525, "blink"),

  ORDER_852526(852526, "fanofknives"),

  ORDER_852527(852527, "shadowstrike"),

  ORDER_852528(852528, "spiritofvengeance"),

  ORDER_852529(852529, "absorb"),

  ORDER_852530(852530, "blight regen aura"),

  ORDER_852531(852531, "avengerform"),

  ORDER_852532(852532, "unavengerform"),

  ORDER_852533(852533, "burrow"),

  ORDER_852534(852534, "unburrow"),

  ORDER_852535(852535, "cannibalize"),

  ORDER_852536(852536, "devourmagic"),

  ORDER_852537(852537, "exhume"),

  ORDER_852538(852538, null),

  ORDER_852539(852539, "flamingattacktarg"),

  ORDER_852540(852540, "flamingattack"),

  ORDER_852541(852541, "unflamingattack"),

  ORDER_852542(852542, "replenish"),

  ORDER_852543(852543, "replenishon"),

  ORDER_852544(852544, "replenishoff"),

  ORDER_852545(852545, "replenishlife (essence of blight)"),

  ORDER_852546(852546, "replenishlifeon"),

  ORDER_852547(852547, "replenishlifeoff"),

  ORDER_852548(852548, "replenishmana (spirit touch)"),

  ORDER_852549(852549, "replenishmanaon"),

  ORDER_852550(852550, "replenishmanaoff"),

  ORDER_852551(852551, "carrionscarabs"),

  ORDER_852552(852552, "carrionscarabson"),

  ORDER_852553(852553, "carrionscarabsoff"),

  ORDER_852554(852554, "carrionscarabsinstant"),

  ORDER_852555(852555, "impale"),

  ORDER_852556(852556, "locustswarm"),

  ORDER_852557(852557, "locust wander"),

  ORDER_852558(852558, "locust return"),

  ORDER_852559(852559, "spiked carapace"),

  ORDER_852560(852560, "breathoffrost"),

  ORDER_852561(852561, "frenzy"),

  ORDER_852562(852562, "frenzyon"),

  ORDER_852563(852563, "frenzyoff"),

  ORDER_852564(852564, "mechanicalcritter"),

  ORDER_852565(852565, "mindrot"),

  ORDER_852566(852566, "neutralinteract"),

  ORDER_852567(852567, "permanent immolation graphic"),

  ORDER_852568(852568, "preservation"),

  ORDER_852569(852569, "sanctuary"),

  ORDER_852570(852570, "shadowsight"),

  ORDER_852571(852571, "spellshield"),

  ORDER_852572(852572, "spellshieldaoe"),

  ORDER_852573(852573, "spirittroll"),

  ORDER_852574(852574, "steal"),

  ORDER_852575(852575, "thorns"),

  ORDER_852576(852576, "attributemodskill"),

  ORDER_852577(852577, "blackarrow"),

  ORDER_852578(852578, "blackarrowon"),

  ORDER_852579(852579, "blackarrowoff"),

  ORDER_852580(852580, "breathoffire"),

  ORDER_852581(852581, "charm"),

  ORDER_852582(852582, "cleaving attack"),

  ORDER_852583(852583, "doom"),

  ORDER_852584(852584, "drunken brawler"),

  ORDER_852585(852585, "drunkenhaze"),

  ORDER_852586(852586, "elementalfury"),

  ORDER_852587(852587, "forkedlightning"),

  ORDER_852588(852588, "howlofterror"),

  ORDER_852589(852589, "manashieldon"),

  ORDER_852590(852590, "manashieldoff"),

  ORDER_852591(852591, "monsoon"),

  ORDER_852592(852592, "silence"),

  ORDER_852593(852593, "stampede"),

  ORDER_852594(852594, "summongrizzly"),

  ORDER_852595(852595, "summonquillbeast"),

  ORDER_852596(852596, "summonwareagle"),

  ORDER_852597(852597, "tornado"),

  ORDER_852598(852598, "wateryminion"),

  ORDER_852599(852599, "battleroar"),

  ORDER_852600(852600, "channel"),

  ORDER_852601(852601, "parasite"),

  ORDER_852602(852602, "parasiteon"),

  ORDER_852603(852603, "parasiteoff"),

  ORDER_852604(852604, "submerge"),

  ORDER_852605(852605, "unsubmerge"),

  ORDER_852606(852606, "flyingcarpet"),

  ORDER_852607(852607, "item defend, elune's grace"),

  ORDER_852608(852608, "spell book"),

  ORDER_852609(852609, "item regeneration (rejuvination potions, ...)"),

  ORDER_852610(852610, "give gold"),

  ORDER_852611(852611, "give lumber"),

  ORDER_852612(852612, "item reveal map"),

  ORDER_852613(852613, "item web"),

  ORDER_852614(852614, "item monster lure"),

  ORDER_852615(852615, "chain dispel"),

  ORDER_852616(852616, "cure aoe"),

  ORDER_852617(852617, ""),

  ORDER_852618(852618, "flare gun"),

  ORDER_852619(852619, "item tiny structures"),

  ORDER_852620(852620, ""),

  ORDER_852621(852621, "item change time of day (moonstone)"),

  ORDER_852622(852622, "item random item"),

  ORDER_852623(852623, "item potion vampirism"),

  ORDER_852624(852624, "item raise dead"),

  ORDER_852625(852625, "dust of appearance"),

  ORDER_852626(852626, ""),

  ORDER_852627(852627, "ultra vision glyph"),

  ORDER_852628(852628, "rune of rebirth"),

  ORDER_852629(852629, "spell"),

  ORDER_852630(852630, "neutralspell (charge gold and lumber)"),

  ORDER_852631(852631, ""),

  ORDER_852632(852632, null),

  ORDER_852633(852633, null),

  ORDER_852634(852634, null),

  ORDER_852635(852635, null),

  ORDER_852636(852636, null),

  ORDER_852637(852637, null),

  ORDER_852638(852638, null),

  ORDER_852639(852639, null),

  ORDER_852640(852640, null),

  ORDER_852641(852641, null),

  ORDER_852642(852642, null),

  ORDER_852643(852643, null),

  ORDER_852644(852644, null),

  ORDER_852645(852645, null),

  ORDER_852646(852646, null),

  ORDER_852647(852647, null),

  ORDER_852648(852648, null),

  ORDER_852649(852649, null),

  ORDER_852650(852650, null),

  ORDER_852651(852651, "militiaunconvert"),

  ORDER_852652(852652, "clusterrockets"),

  ORDER_852653(852653, "demolish"),

  ORDER_852654(852654, "engineering upgrade"),

  ORDER_852655(852655, "factory"),

  ORDER_852656(852656, "robogoblin"),

  ORDER_852657(852657, "unrobogoblin"),

  ORDER_852658(852658, "summonfactory"),

  ORDER_852659(852659, "resumeharvestlumber?"),

  ORDER_852660(852660, "return resources?"),

  ORDER_852661(852661, "orb of venom (poison attack)"),

  ORDER_852662(852662, "acidbomb"),

  ORDER_852663(852663, "chemicalrage"),

  ORDER_852664(852664, "healingspray"),

  ORDER_852665(852665, "transmute"),

  ORDER_852666(852666, "incinerate"),

  ORDER_852667(852667, "lavamonster"),

  ORDER_852668(852668, "soulburn"),

  ORDER_852669(852669, "volcano"),

  ORDER_852670(852670, "incineratearrow"),

  ORDER_852671(852671, "incineratearrowon"),

  ORDER_852672(852672, "incineratearrowoff"),

  ORDER_852673(852673, null),

  ORDER_852674(852674, "item ritual dagger"),

  ORDER_852675(852675, "incite unholy frenzy"),

  ORDER_852676(852676, "sundering blades"),

  ORDER_852677(852677, "attack target priority"),

  ORDER_852678(852678, "variable attribute mod (circlet of nobility)");

  private final int id;

  private final String shortDescription;

  private OrderEnum(int id, String shortDescription) {
    this.id = id;
    this.shortDescription = shortDescription;
  }

  public int getId() {
    return this.id;
  }

  public String getShortDescription() {
    return this.shortDescription;
  }
}
