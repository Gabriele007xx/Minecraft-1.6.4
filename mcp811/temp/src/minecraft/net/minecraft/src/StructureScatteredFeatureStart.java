package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.ComponentScatteredFeatureDesertPyramid;
import net.minecraft.src.ComponentScatteredFeatureJunglePyramid;
import net.minecraft.src.ComponentScatteredFeatureSwampHut;
import net.minecraft.src.StructureStart;
import net.minecraft.src.World;

public class StructureScatteredFeatureStart extends StructureStart {

   public StructureScatteredFeatureStart() {}

   public StructureScatteredFeatureStart(World p_i2060_1_, Random p_i2060_2_, int p_i2060_3_, int p_i2060_4_) {
      super(p_i2060_3_, p_i2060_4_);
      BiomeGenBase var5 = p_i2060_1_.func_72807_a(p_i2060_3_ * 16 + 8, p_i2060_4_ * 16 + 8);
      if(var5 != BiomeGenBase.field_76782_w && var5 != BiomeGenBase.field_76792_x) {
         if(var5 == BiomeGenBase.field_76780_h) {
            ComponentScatteredFeatureSwampHut var7 = new ComponentScatteredFeatureSwampHut(p_i2060_2_, p_i2060_3_ * 16, p_i2060_4_ * 16);
            this.field_75075_a.add(var7);
         } else {
            ComponentScatteredFeatureDesertPyramid var8 = new ComponentScatteredFeatureDesertPyramid(p_i2060_2_, p_i2060_3_ * 16, p_i2060_4_ * 16);
            this.field_75075_a.add(var8);
         }
      } else {
         ComponentScatteredFeatureJunglePyramid var6 = new ComponentScatteredFeatureJunglePyramid(p_i2060_2_, p_i2060_3_ * 16, p_i2060_4_ * 16);
         this.field_75075_a.add(var6);
      }

      this.func_75072_c();
   }
}
