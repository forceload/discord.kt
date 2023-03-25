package io.github.teamcrez.discordkt.discord.types

import io.github.teamcrez.discordkt.discord.api.DiscordFlags

class DiscordNumber(override val coveredValue: Double): DiscordType<Double> {
    override val type = DiscordFlags.CommandArgumentType.NUMBER
    override fun toString() = this.coveredValue.toString()
}
