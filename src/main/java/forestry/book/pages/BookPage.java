package forestry.book.pages;

import java.util.Collection;
import java.util.Collections;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import forestry.api.book.IBookPage;

public class BookPage implements IBookPage {
	@Override
	public void initPage(GuiScreen gui) {
	}

	@Override
	public void draw(GuiScreen gui, int startX, int startY, int guiLeft, int guiTop) {
	}

	@Override
	public void onButtonPressed(GuiScreen gui, GuiButton button) {
	}

	@Override
	public Collection<String> getTooltip(int mouseX, int mouseY) {
		return Collections.emptySet();
	}
}
