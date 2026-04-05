# Changelog

## [2.0.4] - 1.21.1

### Fixed
- **Drop count configuration** — the `dropCount` value is now correctly applied to all chickens. Previously many chickens ignored the configured value and always produced 1 item. Now if the config is set to `64` (default) or any other value such as `16`, all chickens respect that number.
- **JEI recipes — Roost Production** — chickens of any tier and any combination of stats now correctly appear in the Roost Production category. Previously only tier 1 recipes were shown.
- **JEI recipes — Drop** — same tier matching fix applied to the Drop category.
- **JEI recipes — Breeding** — chickens with mixed stats (e.g. Gain 10 / Growth 1 / Strength 10) now correctly match their breeding recipe regardless of individual stat values.
- **JEI recipes — Avian Fluid Converter** — recipes now display correctly for all applicable chickens.
- **JEI recipes — Avian Chemical Converter** — recipes now display correctly for all applicable chickens.
- **JEI recipes — Avian Dousing Machine** — fluid and chemical dousing recipes now display correctly for all applicable chickens.
- **Legacy config generation** — `dropItemAmount` is now always written with the configured `dropCount` value in the generated `chickens.cfg`, instead of carrying over stale values of `1` from old config files.