package net.minecraft.src;

import java.util.List;
import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.ComponentStronghold;
import net.minecraft.src.ComponentStrongholdStairs2;
import net.minecraft.src.EnumDoor;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.StructureBoundingBox;
import net.minecraft.src.StructureComponent;
import net.minecraft.src.StructureStrongholdPieces;
import net.minecraft.src.World;

public class ComponentStrongholdStraight extends ComponentStronghold {

   private boolean field_75019_b;
   private boolean field_75020_c;


   public ComponentStrongholdStraight() {}

   public ComponentStrongholdStraight(int p_i2084_1_, Random p_i2084_2_, StructureBoundingBox p_i2084_3_, int p_i2084_4_) {
      super(p_i2084_1_);
      this.field_74885_f = p_i2084_4_;
      this.field_143013_d = this.func_74988_a(p_i2084_2_);
      this.field_74887_e = p_i2084_3_;
      this.field_75019_b = p_i2084_2_.nextInt(2) == 0;
      this.field_75020_c = p_i2084_2_.nextInt(2) == 0;
   }

   protected void func_143012_a(NBTTagCompound p_143012_1_) {
      super.func_143012_a(p_143012_1_);
      p_143012_1_.func_74757_a("Left", this.field_75019_b);
      p_143012_1_.func_74757_a("Right", this.field_75020_c);
   }

   protected void func_143011_b(NBTTagCompound p_143011_1_) {
      super.func_143011_b(p_143011_1_);
      this.field_75019_b = p_143011_1_.func_74767_n("Left");
      this.field_75020_c = p_143011_1_.func_74767_n("Right");
   }

   public void func_74861_a(StructureComponent p_74861_1_, List p_74861_2_, Random p_74861_3_) {
      this.func_74986_a((ComponentStrongholdStairs2)p_74861_1_, p_74861_2_, p_74861_3_, 1, 1);
      if(this.field_75019_b) {
         this.func_74989_b((ComponentStrongholdStairs2)p_74861_1_, p_74861_2_, p_74861_3_, 1, 2);
      }

      if(this.field_75020_c) {
         this.func_74987_c((ComponentStrongholdStairs2)p_74861_1_, p_74861_2_, p_74861_3_, 1, 2);
      }

   }

   public static ComponentStrongholdStraight func_75018_a(List p_75018_0_, Random p_75018_1_, int p_75018_2_, int p_75018_3_, int p_75018_4_, int p_75018_5_, int p_75018_6_) {
      StructureBoundingBox var7 = StructureBoundingBox.func_78889_a(p_75018_2_, p_75018_3_, p_75018_4_, -1, -1, 0, 5, 5, 7, p_75018_5_);
      return func_74991_a(var7) && StructureComponent.func_74883_a(p_75018_0_, var7) == null?new ComponentStrongholdStraight(p_75018_6_, p_75018_1_, var7, p_75018_5_):null;
   }

   public boolean func_74875_a(World p_74875_1_, Random p_74875_2_, StructureBoundingBox p_74875_3_) {
      if(this.func_74860_a(p_74875_1_, p_74875_3_)) {
         return false;
      } else {
         this.func_74882_a(p_74875_1_, p_74875_3_, 0, 0, 0, 4, 4, 6, true, p_74875_2_, StructureStrongholdPieces.func_75197_b());
         this.func_74990_a(p_74875_1_, p_74875_2_, p_74875_3_, this.field_143013_d, 1, 1, 0);
         this.func_74990_a(p_74875_1_, p_74875_2_, p_74875_3_, EnumDoor.OPENING, 1, 1, 6);
         this.func_74876_a(p_74875_1_, p_74875_3_, p_74875_2_, 0.1F, 1, 2, 1, Block.field_72069_aq.field_71990_ca, 0);
         this.func_74876_a(p_74875_1_, p_74875_3_, p_74875_2_, 0.1F, 3, 2, 1, Block.field_72069_aq.field_71990_ca, 0);
         this.func_74876_a(p_74875_1_, p_74875_3_, p_74875_2_, 0.1F, 1, 2, 5, Block.field_72069_aq.field_71990_ca, 0);
         this.func_74876_a(p_74875_1_, p_74875_3_, p_74875_2_, 0.1F, 3, 2, 5, Block.field_72069_aq.field_71990_ca, 0);
         if(this.field_75019_b) {
            this.func_74884_a(p_74875_1_, p_74875_3_, 0, 1, 2, 0, 3, 4, 0, 0, false);
         }

         if(this.field_75020_c) {
            this.func_74884_a(p_74875_1_, p_74875_3_, 4, 1, 2, 4, 3, 4, 0, 0, false);
         }

         return true;
      }
   }
}
