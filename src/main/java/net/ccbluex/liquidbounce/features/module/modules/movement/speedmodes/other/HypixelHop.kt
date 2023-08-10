/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.other

import net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.SpeedMode
import net.ccbluex.liquidbounce.utils.MinecraftInstance
import net.ccbluex.liquidbounce.utils.MovementUtils.isMoving
import net.ccbluex.liquidbounce.utils.MovementUtils.speed
import net.ccbluex.liquidbounce.utils.MovementUtils.strafe
import net.minecraft.potion.Potion

object HypixelHop : SpeedMode("HypixelHop") {
    override fun onMotion() {
        if (isMoving) {
            if (mc.thePlayer.onGround) {
                strafe(0.483f)
                mc.thePlayer.motionY= 0.42
                return
            } else if (mc.thePlayer.motionY < 0.005 && mc.thePlayer.motionY > 0.005) {
                mc.thePlayer.motionY -= 0.02
            }
        }
    }

}
