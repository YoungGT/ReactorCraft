// Date: 23/02/2014 6:00:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelGasCollector extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape2a;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape4b;
	ModelRenderer Shape4c;
	ModelRenderer Shape4d;

	public ModelGasCollector()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 30);
		Shape2.addBox(0F, 0F, 0F, 16, 8, 1);
		Shape2.setRotationPoint(-8F, 23F, 8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 0, 19);
		Shape2a.addBox(0F, 0F, 0F, 16, 8, 1);
		Shape2a.setRotationPoint(-8F, 23F, -9F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 69);
		Shape3.addBox(0F, 0F, 0F, 1, 8, 18);
		Shape3.setRotationPoint(-9F, 23F, -9F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 41);
		Shape3a.addBox(0F, 0F, 0F, 1, 8, 18);
		Shape3a.setRotationPoint(8F, 23F, -9F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 64, 67);
		Shape4.addBox(0F, 0F, 0F, 8, 5, 8);
		Shape4.setRotationPoint(-4F, 8F, -4F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new ModelRenderer(this, 64, 0);
		Shape4a.addBox(0F, 0F, 0F, 16, 3, 16);
		Shape4a.setRotationPoint(-8F, 20F, -8F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new ModelRenderer(this, 64, 20);
		Shape4b.addBox(0F, 0F, 0F, 14, 3, 14);
		Shape4b.setRotationPoint(-7F, 17F, -7F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new ModelRenderer(this, 64, 38);
		Shape4c.addBox(0F, 0F, 0F, 12, 2, 12);
		Shape4c.setRotationPoint(-6F, 15F, -6F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape4d = new ModelRenderer(this, 64, 54);
		Shape4d.addBox(0F, 0F, 0F, 10, 2, 10);
		Shape4d.setRotationPoint(-5F, 13F, -5F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		Shape1.render(f5);

		boolean f = (Boolean)li.get(0);
		if (f) {
			Shape2.render(f5);
			Shape2a.render(f5);
			Shape3.render(f5);
			Shape3a.render(f5);
		}

		Shape4.render(f5);
		Shape4a.render(f5);
		Shape4b.render(f5);
		Shape4c.render(f5);
		Shape4d.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
