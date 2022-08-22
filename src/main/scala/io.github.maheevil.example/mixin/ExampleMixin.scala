package io.github.maheevil.example.mixin

import net.minecraft.client.gui.screens.TitleScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.{At, Inject}
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Array(classOf[TitleScreen]))
class ExampleMixin {
  @Inject(
    method = Array("init()V"),
    at = Array(new At("HEAD") )
  )
  def init(callback:CallbackInfo): Unit = {
    println("bruh")
  }
}
