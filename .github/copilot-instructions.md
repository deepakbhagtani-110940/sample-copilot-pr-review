# PR Review Strategy: Automated Test Mapping

## 1. Objective
For every Pull Request, identify the relationship between the modified source code and the automation test suite located in the external repository: `deepakbhagtani-110940/QEI-AUTOMATION`.

## 2. Analysis & Mapping Logic
When reviewing changes, perform the following steps:
* **Identify Impact:** Analyze the PR diff to determine which specific functions, API endpoints, or UI components are modified.
* **Targeted Cross-Repository Search:** Perform a GitHub code search on the indexed `deepakbhagtani-110940/QEI-AUTOMATION` repository, specifically within the `src/tests` directory.
* **Mandatory Search Directories:** All automation tests are located within `src/tests`. You must scan this entire directory and its sub-folders (e.g., `stagingTest`, `componentTests`, `subgroupTests`, `dashboardwidgetchild`) for matching logic.
* **Matching Heuristic:** * Search for shared strings (API endpoints, widget IDs, or class names) within `src/tests`.
    * Use naming conventions (e.g., `featureName.test.ts` or `featureName.spec.ts`) to link source changes to automation tests found in the QA repo.

## 3. Output Requirement: QA Test Impact Analysis
Every review **must** include a section titled "QA Test Impact Analysis" containing:

### **Test Mapping Table**
| Source Component | QA Test Path (QEI-AUTOMATION) | Test Category | Confidence |
| :--- | :--- | :--- | :--- |
| `[File Path]` | `src/tests/[Sub-Folder]/[File]` | e.g., Staging / WidgetChild | [High/Med/Low] |

### **Coverage & Risk Assessment**
* **Missing Automation Coverage:** If a critical change is made but no matching test is found within `src/tests` in the `QEI-AUTOMATION` repo, explicitly flag this as a **"Coverage Gap"** risk.
* **Update Required:** Note if an existing test is found but the PR changes a contract (e.g., new required params) that will break the current automation in the QA repository.

## 4. Goal
Ensure the reviewer knows exactly which automated tests in the `QEI-AUTOMATION` repo need to be triggered, updated, or created to validate this PR.
