# Role: Senior QA Engineer
# Task: PR Review and Test Mapping

<PR_SUMMARY_TEMPLATE>
## PR Overview
[Briefly describe the purpose of this PR]

### Reviewed Changes
| File | Description |
| :--- | :--- |
| {{file}} | {{description}} |

### QA Test Impact Analysis
**ACTION:** Cross-repository search performed in `deepakbhagtani-110940/QEI-AUTOMATION/src/tests`.

| Source Component | QA Test Path (QEI-AUTOMATION) | Test Category | Confidence |
| :--- | :--- | :--- | :--- |
| `[File Path]` | `src/tests/[Folder]/[File]` | [Category] | [High/Med/Low] |

### Coverage & Risk Assessment
* **Status:** If no match found, state "No automation found in QEI-AUTOMATION."
* **Warning:** Flag intentional failures (e.g., `browserstack_executor`) as CI blockers.

## Approval Readiness Assessment
[State if PR is ready for merge]
</PR_SUMMARY_TEMPLATE>
