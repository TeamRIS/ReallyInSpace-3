// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelalienbee extends EntityModel<Entity> {
	private final ModelRenderer Bee;
	private final ModelRenderer Flgel1;
	private final ModelRenderer Flgel2;

	public Modelalienbee() {
		textureWidth = 64;
		textureHeight = 64;

		Bee = new ModelRenderer(this);
		Bee.setRotationPoint(-3.0F, 21.0F, -6.0F);
		Bee.setTextureOffset(24, 44).addBox(-1.0F, -8.0F, 0.0F, 8.0F, 8.0F, 12.0F, 0.0F, false);
		Bee.setTextureOffset(0, 0).addBox(1.0F, -7.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 0).addBox(5.0F, -7.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 62).addBox(5.0F, 0.0F, 4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 62).addBox(5.0F, 0.0F, 7.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 60).addBox(5.0F, 1.0F, 8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 60).addBox(5.0F, 1.0F, 5.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 62).addBox(1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 62).addBox(1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 60).addBox(1.0F, 1.0F, 8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 60).addBox(1.0F, 1.0F, 5.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 0).addBox(5.0F, -8.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bee.setTextureOffset(0, 57).addBox(3.0F, -4.0F, 12.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		Flgel1 = new ModelRenderer(this);
		Flgel1.setRotationPoint(4.0F, 14.0F, -1.0F);
		Flgel1.setTextureOffset(9, 24).addBox(-1.0F, 0.0F, -3.0F, 7.0F, 0.0F, 6.0F, 0.0F, false);

		Flgel2 = new ModelRenderer(this);
		Flgel2.setRotationPoint(-4.0F, 14.0F, -1.0F);
		Flgel2.setTextureOffset(2, 18).addBox(-6.0F, 0.0F, -3.0F, 7.0F, 0.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Bee.render(matrixStack, buffer, packedLight, packedOverlay);
		Flgel1.render(matrixStack, buffer, packedLight, packedOverlay);
		Flgel2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Flgel1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.Flgel2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}