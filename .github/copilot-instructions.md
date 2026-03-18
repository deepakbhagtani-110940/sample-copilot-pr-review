# PR Review Strategy: Automated Test Mapping

## 1. Objective
Identify the relationship between modified code and the `deepakbhagtani-110940/QEI-AUTOMATION` repository.

## 2. Analysis & Mapping Logic
* **Targeted Cross-Repository Search:** Perform a search on the indexed `QEI-AUTOMATION` repo within `src/tests`.
* **Directories to Scan:** `src/tests/__tests__`, `src/tests/stagingTest`, `src/tests/componentTests`, `src/tests/subgroupTests`, `src/tests/dashboardwidgetchild`.

## 3. Output Requirement: MANDATORY REVIEW COMMENT
**CRITICAL:** You must include the following analysis as a standalone comment in the "Review" section of the PR, not just the summary.

### **QA Test Impact Analysis**
| Source Component | QA Test Path (QEI-AUTOMATION) | Test Category | Confidence |
| :--- | :--- | :--- | :--- |
| `[File Path]` | `src/tests/[Folder]/[File]` | e.g., Staging / WidgetChild | [High/Med/Low] |

### **Coverage & Risk Assessment**
* **Coverage Gap:** If no match is found in `QEI-AUTOMATION/src/tests`, flag this as a **"Coverage Gap"**.
* **Failure Intent:** If the PR adds a "failed test" (like `failed test.java`), explicitly warn that this will break CI/CD pipelines in the QA repo unless quarantined.
