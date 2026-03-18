# PR Review & Summary Rule: Mandatory Format

## PR Overview
You MUST start every PR review comment with this exact header. Provide a brief summary of the changes here.

### Reviewed Changes
| File | Description |
| :--- | :--- |
| {{file_name}} | {{brief_description}} |

### QA Test Impact Analysis
**MANDATORY:** Perform a cross-repository search in `deepakbhagtani-110940/QEI-AUTOMATION`. 

| Source Component | QA Test Path (QEI-AUTOMATION) | Test Category | Confidence |
| :--- | :--- | :--- | :--- |
| `[File Path]` | `src/tests/[Folder]/[File]` | e.g., Staging / WidgetChild | [High/Med/Low] |

### Coverage & Risk Assessment
* **Coverage Status:** If no match is found in `QEI-AUTOMATION/src/tests`, you MUST explicitly state: "No automation found in QEI-AUTOMATION."
* **Failure Intent:** If the test is designed to fail (e.g., uses `browserstack_executor` to fail), warn that it will break CI.

## Approval Readiness Assessment
**MANDATORY:** Provide a final statement on whether this PR is ready for merge based on the test impact above.

# Agent Constraints
- DO NOT create new pull requests or branches.
- DO NOT perform code changes.
- ALWAYS provide the analysis as a COMMENT on the current PR.
