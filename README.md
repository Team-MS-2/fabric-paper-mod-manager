# fabric-paper-mod-manager

fabric-paper-mod-manager is a Team-MS-2 project repository.

This README was generated from the GitHub default branch metadata so new maintainers can quickly identify the repository's role, build path, and runtime expectations.

## Repository Snapshot

| Item | Value |
| --- | --- |
| GitHub repository | `Team-MS-2/fabric-paper-mod-manager` |
| Default branch | `main` |
| Repository type | Java/Gradle project |

## Repository Layout

- `buildSrc/`
- `gradle/`
- `run/`
- `runServerTask/`
- `src/`

## Build

Use the Gradle wrapper when it is present:

```powershell
.\gradlew.bat build
```

## Deployment Notes

- Keep changes scoped to the owning subsystem and document any required downstream publish or server restart steps in the commit or PR.

## Maintenance Checklist

- Confirm the default branch still matches the active deployment branch before release work.
- Run the narrowest useful build or validation command after code/config changes.
- Update this README when module names, runtime dependencies, or deployment paths change.
