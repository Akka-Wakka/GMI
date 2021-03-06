package akkawakka.minecraft.gmi

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent

import akkawakka.minecraft.gmi.blocks._
import akkawakka.minecraft.gmi.interfaces._
import akkawakka.minecraft.gmi.items._

@Mod(modid="akkagmi", name="Geology, Mining & Industry",
    version="0.1_pre-alpha", acceptedMinecraftVersions="1.7.2",
    modLanguage = "scala")
object AkkaGMI {

  final val ModID: String = "akkagmi"
  final val ModName: String = "Mining & Industry"
  final val ModNameShort: String = "GMI"
  final val ModVersion: String = "0.1_pre-alpha"

  val gmiCreativeTab: GMICreativeTab = new GMICreativeTab(ModID)

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) {
    
  }

  @EventHandler
  def load(event: FMLInitializationEvent) {
    
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) {
    
  }

}
