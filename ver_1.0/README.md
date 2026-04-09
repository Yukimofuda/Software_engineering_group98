# EBU6304 Group 98 Demo Version 1.2

BUPT International School Teaching Assistant Recruitment System.

## Implemented Features

- TA profile creation and editing
- CV path recording
- Job browsing and application submission
- Application status tracking
- MO job posting and applicant review
- Admin workload monitoring and CSV export
- CSV file persistence without any database
- Simple skill-match scoring for demo use

## Task Plan Alignment Check

This demo now aligns most clearly with:

- L2 authentication and dashboard framework
- L3 core TA and MO workflow in a simplified integrated form
- part of L4 admin workload monitoring
- part of L5 skill matching

Current gaps against `task_plan.md`:

- no dedicated service-layer split such as `TAService`, `MOService`, `AdminService`
- no notification module for `US-8`
- no formal JUnit test suite / JavaDoc package delivery yet
- data persistence is CSV-based but still uses a simplified flat source layout instead of the fully packaged MVC structure in `ProjectRoot`

## Iteration 1.2 Update

This iteration continues the `ver_1.0` demo and improves compliance with the task plan for the intermediate product build.

New updates in this version:

- added a shared `BaseDashboard` so TA / MO / Admin screens reuse a common dashboard shell
- login now distinguishes missing username, missing password, and wrong credentials more clearly
- registration now includes password confirmation, matching the L2 requirement more closely
- TA job board search/filter for faster browsing
- MO job list search/filter
- MO applicant filtering by name, email, skills, status, or match summary
- Admin workload export files now include a timestamp in the filename
- Admin workload status is clearer, with `OK`, `NEAR LIMIT`, and `OVERLOAD - review allocation immediately`
- README and architecture notes updated to reflect the newer demo iteration more clearly

## Run

```bash
./compile.sh
./run.sh
```

## Demo Accounts

- `admin / admin123`
- `ta1 / ta123`
- `ta2 / ta456`
- `mo1 / mo123`
- `mo2 / mo456`

## Project Layout

- `src/`: Java source code
- `data/`: CSV data files
- `docs/architecture.md`: structure overview
- `compile.sh`: compile script
- `run.sh`: run script

## Version Notes

- `ver_1.0`: first complete integrated demo build
- `ver_1.1`: usability-focused iteration with filtering and improved admin monitoring feedback
- `ver_1.2`: task-plan alignment update with shared dashboard base and stronger L2 authentication checks
