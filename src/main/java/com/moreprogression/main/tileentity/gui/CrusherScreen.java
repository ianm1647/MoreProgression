package com.moreprogression.main.tileentity.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import com.moreprogression.main.MoreProgression;
import com.moreprogression.main.tileentity.container.CrusherContainer;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CrusherScreen extends ContainerScreen<CrusherContainer> {
	
	private static final ResourceLocation TEXTURES = new ResourceLocation(MoreProgression.MODID, "textures/gui/container/base_furnace.png");

	public CrusherScreen(CrusherContainer container, PlayerInventory playerInv, ITextComponent title) {
		super(container, playerInv, title);
	}
	
	@Override
	public void render(int mouseX, int mouseY, float f) {
		this.renderBackground();
		super.render(mouseX, mouseY, f);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.title.getFormattedText();
		this.font.drawString(s, (float) (this.xSize / 2 - this.font.getStringWidth(s) / 2), 6.0F, 4210752);
		this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0F,
				(float) (this.ySize - 96 + 2), 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.minecraft.getTextureManager().bindTexture(TEXTURES);
		int i = this.guiLeft;
		int j = this.guiTop;
		this.blit(i, j, 0, 0, this.xSize, this.ySize);
		if (((CrusherContainer) this.container).func_217061_l()) {
			int k = ((CrusherContainer) this.container).func_217059_k();
			this.blit(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
		}

		int l = ((CrusherContainer) this.container).func_217060_j();
		this.blit(i + 79, j + 34, 176, 14, l + 1, 16);
	}

}
