package com.denfop.ssp.integration.avaritia;

import com.denfop.ssp.tiles.TileEntitySolarPanel;

public class TileEntityNeutroniumSolar extends TileEntitySolarPanel {
	public static TileEntitySolarPanel.SolarConfig settings;

	public TileEntityNeutroniumSolar() {
		super(TileEntityNeutroniumSolar.settings);
	}
}
