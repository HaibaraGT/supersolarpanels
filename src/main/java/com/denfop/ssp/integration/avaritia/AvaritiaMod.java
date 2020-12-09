package com.denfop.ssp.integration.avaritia;

import ic2.core.block.ITeBlock;
import ic2.core.block.TileEntityBlock;
import ic2.core.ref.TeBlock;
import ic2.core.util.Util;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Set;


public enum AvaritiaMod implements ITeBlock
//implements ITeBlock
{

	neutronium_solar_panel2(TileEntityNeutroniumSolar.class),
	infinity_solar_panel(TileEntityInfinitySolar.class, 82, EnumRarity.RARE);
	public static final ResourceLocation IDENTITY2;
	private static final AvaritiaMod[] VALUES2;

	static {
		VALUES2 = values();
		IDENTITY2 = new ResourceLocation("super_solar_panels", "machines2");
	}

	private final Class<? extends TileEntityBlock> teClass2;
	private final int itemMeta;
	private final EnumRarity rarity;
	private TileEntityBlock dummyTe2;


	AvaritiaMod(final Class<? extends TileEntityBlock> teClass) {
		this(teClass, 81, EnumRarity.UNCOMMON);

	}

	AvaritiaMod(final Class<? extends TileEntityBlock> teClass, final int itemMeta, final EnumRarity rarity) {
		this.teClass2 = teClass;
		this.itemMeta = itemMeta;
		this.rarity = rarity;
		GameRegistry.registerTileEntity(teClass, "super_solar_panels:" + this.getName());


	}

	public String getName() {
		return this.name();
	}

	public int getId() {
		return this.itemMeta;
	}

	public static void buildDummies() {
		final ModContainer mc = Loader.instance().activeModContainer();
		if (mc == null || !"super_solar_panels".equals(mc.getModId())) {
			throw new IllegalAccessError("Don't mess with this please.");
		}
		for (final AvaritiaMod block : AvaritiaMod.VALUES2) {
			if (block.teClass2 != null) {
				try {
					block.dummyTe2 = block.teClass2.newInstance();
				} catch (Exception e) {
					if (Util.inDev()) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@SuppressWarnings("EmptyMethod")
	public static void buildItems(Side side) {
		// TODO Auto-generated method stub

	}

	public ResourceLocation getIdentifier() {
		return AvaritiaMod.IDENTITY2;
	}

	public boolean hasItem() {
		return true;
	}

	public Class<? extends TileEntityBlock> getTeClass() {
		return this.teClass2;
	}

	@Override
	public boolean hasActive() {
		// TODO Auto-generated method stub
		return false;
	}

	public Set<EnumFacing> getSupportedFacings() {
		return Util.horizontalFacings;
	}

	public float getHardness() {
		return 3.0f;
	}

	public float getExplosionResistance() {
		return 0.0f;
	}

	public TeBlock.HarvestTool getHarvestTool() {
		return TeBlock.HarvestTool.Pickaxe;
	}

	public TeBlock.DefaultDrop getDefaultDrop() {
		return TeBlock.DefaultDrop.Self;
	}

	public EnumRarity getRarity() {
		return this.rarity;
	}

	public boolean allowWrenchRotating() {
		return false;
	}

	public TileEntityBlock getDummyTe() {
		return this.dummyTe2;
	}
}

