# Demo Architecture

```text
software_engine/
├── src/
│   ├── Main.java
│   ├── DemoMetadata.java
│   ├── LoginFrame.java
│   ├── RegisterFrame.java
│   ├── TADashboard.java
│   ├── MODashboard.java
│   ├── AdminDashboard.java
│   ├── FileStorage.java
│   ├── MatchingService.java
│   ├── MatchResult.java
│   ├── ValidationUtils.java
│   ├── User.java
│   ├── TAProfile.java
│   ├── Job.java
│   ├── Application.java
│   └── SystemSmokeTest.java
├── data/
│   ├── users.csv
│   ├── profiles.csv
│   ├── jobs.csv
│   ├── applications.csv
│   └── admin_workload_report.csv
├── docs/
│   └── architecture.md
├── compile.sh
├── run.sh
└── README.md
```

## Layering

- UI layer: `LoginFrame`, `RegisterFrame`, `BaseDashboard`, `TADashboard`, `MODashboard`, `AdminDashboard`
- Domain layer: `User`, `TAProfile`, `Job`, `Application`, `MatchResult`
- Service layer: `MatchingService`, `ValidationUtils`
- Persistence layer: `FileStorage`
- Verification entry: `SystemSmokeTest`

## Iteration 1.2 Additions

- `BaseDashboard`: shared logout menu, title template, and tab container for all role dashboards
- `LoginFrame`: clearer empty-field validation to better match the L2 task-plan requirements
- `RegisterFrame`: added password confirmation to align better with the L2 registration requirement
- `TADashboard`: added search/filter support for the TA job browsing table
- `MODashboard`: added search/filter support for MO job posts and applicant review
- `AdminDashboard`: export filenames now include timestamps and workload labels are more descriptive
- `DemoMetadata`: centralised demo version and iteration notes for the login/about flow
