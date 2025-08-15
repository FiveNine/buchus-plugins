package com.partydefencetracker;

import lombok.Getter;

enum BossInfo
{
	ABYSSAL_PORTAL("Abyssal portal", 176, 176, 60),
	ABYSSAL_SIRE("Abyssal Sire", 250, 200, 20),
	AKKHA("Akkha", 80, 100, 10),
	AKKHAS_SHADOW("Akkha's Shadow", 30, 100, 10),
	ALCHEMICAL_HYDRA("Alchemical Hydra", 100, 260, 150),
	ARTIO("Artio", 150, 90, 0),
	BA_BA("Ba-Ba", 20, 100, 280),
	CALLISTO("Callisto", 225, 140, 0),
	CALVARION("Calvar'ion", 225, 178, 198),
	CERBERUS("Cerberus", 110, 220, 65),
	CHAOS_ELEMENTAL("Chaos Elemental", 270, 270, 70),
	COMMANDER_ZILYANA("Commander Zilyana", 300, 300, 100),
	CORE("<col=00ffff>Core</col>", 0, 0, 0),
	CORPOREAL_BEAST("Corporeal Beast", 310, 350, 150),
	DAGANNOTH_PRIME("Dagannoth Prime", 255, 255, 255),
	DAGANNOTH_REX("Dagannoth Rex", 255, 0, 10),
	DAGANNOTH_SUPREME("Dagannoth Supreme", 128, 244, 255),
	DEATHLY_MAGE("Deathly mage", 155, 210, 0),
	DEATHLY_RANGER("Deathly ranger", 155, 155, 0),
	ELIDINIS_WARDEN("Elidinis' Warden", 30, 190, 20),
	GENERAL_GRAARDOR("General Graardor", 250, 150, 298),
	GIANT_MOLE("Giant Mole", 200, 200, 80),
	GREAT_OLM("Great Olm", 150, 250, 200),
	GREAT_OLM_LEFT_CLAW("Great Olm (Left claw)", 175, 175, 200),
	GREAT_OLM_RIGHT_CLAW("Great Olm (Right claw)", 175, 87, 50),
	ICE_DEMON("Ice Demon", 160, 390, 40),
	KALPHITE_QUEEN("Kalphite Queen", 300, 150, 100),
	KEPHRI("Kephri", 20, 125, 200),
	KING_BLACK_DRAGON("King Black Dragon", 240, 240, 80),
	KREE_ARRA("Kree'arra", 260, 200, 200),
	KRIL_TSUTSAROTH("K'ril Tsutsaroth", 270, 200, 80),
	LIZARDMAN_SHAMAN("Lizardman shaman", 210, 130, 50),
	NEX("Nex", 260, 230, 300),
	NYLOCAS_VASILIAS("Nylocas Vasilias", 50, 50, 0),
	OBELISK("<col=00ffff>Obelisk</col>", 40, 100, 50),
	PESTILENT_BLOAT("Pestilent Bloat", 100, 150, 600),
	PHANTOM_MUSPAH("Phantom Muspah", 200, 150, 34), //180 shielded - 34 mageDef in melee
	SARACHNIS("Sarachnis", 150, 150, 150),
	SCORPIA("Scorpia", 180, 1, 44),
	SKELETAL_MYSTIC("Skeletal Mystic", 187, 140, 140),
	SKOTIZO("Skotizo", 200, 280, 80),
	SOTETSEG("Sotetseg", 200, 250, 30),
	SPINDEL("Spindel", 225, 235, 205),
	TEKTON("Tekton", 205, 205, 0),
	TEKTON_ENRAGED("Tekton (enraged)", 205, 205, 0),
	THE_MAIDEN_OF_SUGADINTI("The Maiden of Sugadinti", 200, 350, 0),
	TUMEKENS_WARDEN("Tumeken's Warden", 30, 190, 20),
	TZKAL_ZUK("TzKal-Zuk", 260, 150, 350),
	TZTOK_JAD("TzTok-Jad", 480, 480, 0),
	VASA("Vasa Nistirio", 175, 230, 400),
	VENENATIS("Venenatis", 321, 300, 300),
	VETION("Vet'ion", 395, 300, 250),
	VORKATH("Vorkath", 214, 150, 240),
	XARPUS("Xarpus", 250, 220, 0),
	YAMA("Yama", 225, 250, 60), // -30 melee
	ZEBAK("Zebak", 20, 100, 200),
	ZULRAH("Zulrah", 300, 300, -45);

	@Getter
	private final String name;
	@Getter
	private final double baseDef;
	@Getter
	private final double baseMagic;
	@Getter
	private final double baseMagicDef;

	BossInfo(String name, double baseDef, double baseMagic, double baseMagicDef)
	{
		this.name = name;
		this.baseDef = baseDef;
		this.baseMagic = baseMagic;
		this.baseMagicDef = baseMagicDef;
	}

	static BossInfo getBoss(String bossName)
	{
		for (BossInfo boss : values())
		{
			if (boss.name.contains(bossName))
			{
				return boss;
			}
		}
		return null;
	}

	static double getBaseDefence(String bossName)
	{
		BossInfo boss = getBoss(bossName);
		if (boss != null)
		{
			return boss.baseDef;
		}
		return 0;
	}

	static double getBaseMagic(String bossName)
	{
		BossInfo boss = getBoss(bossName);
		if(boss != null)
		{
			return boss.baseMagic;
		}
		return 0;
	}

	static double getBaseMagicDef(String bossName)
	{
		BossInfo boss = getBoss(bossName);
		if(boss != null)
		{
			return boss.baseMagicDef;
		}
		return 0;
	}
}
