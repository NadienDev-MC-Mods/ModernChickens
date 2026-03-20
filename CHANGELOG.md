# Changelog

## [1.21.1 2.0]

### Added
- **`/chickens kill` command** — Kills all mod chickens present in the current dimension. Requires operator permission level 2. Reports the number of chickens removed, or notifies if none were found.
- **Prometheum Chicken** — New chicken that drops Prometheum ingots.
- **Entro Dust Chicken** — New chicken that drops Entro Dust.

### Changed
- **Nether spawn rate reduced** — The spawn charge and energy budget for Nether chicken spawns have been lowered to 8%, reducing how frequently mod chickens appear in Nether biomes.
- **Snow biome spawn rate reduced** — The spawn weight modifier for snowy biomes has been reduced to 10%, making mod chickens noticeably rarer in cold biomes.
- **Breeder speed increased** — The breeder speed multiplier has been raised to 4.0×, making the breeding process 300% faster than the default rate.
- **Neutronium Chicken drop changed** — The Neutronium Chicken now drops the Neutronium Ingot instead of the Neutronium Nugget, reflecting its high-tier status.
- **Netherite Chicken now listed correctly** — Fixed an issue where the Netherite Chicken was not appearing in the chicken registry listing.

### Removed
- **Dynamic chicken auto-registration removed** — The mod previously scanned the entire item registry at startup and automatically generated placeholder chickens for any modded ingot it found (e.g. if Thermal Expansion was installed, it would auto-create Copper, Tin, Silver chickens, etc.). These auto-generated chickens used a generic texture, derived their color from a hash of the material name, and were assigned no spawn type (they could not spawn naturally). While convenient for broad mod-pack coverage, this system caused conflicts and unpredictable behaviour. Chickens are now defined exclusively through the curated static data set.

### Fixed
- **Texture errors on Roost, Breeder and Collector** — Model files for `breeder`, `collector`, and `breeder_privacy` were referencing assets under the `roost:` namespace, which is not always present when the mod runs alongside certain other mods. The block models have been moved to the `chickens:` namespace to ensure textures load correctly regardless of which other mods are installed.
