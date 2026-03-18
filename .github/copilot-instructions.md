# PR Review Strategy: Automated Test Mapping

## 1. Objective
Identify the relationship between modified code and the `deepakbhagtani-110940/QEI-AUTOMATION` repository.

## 2. Output Requirement: PR COMMENT FORMAT
**IMPORTANT:** For every review, you MUST append the following table to the END of your main PR review comment. Do not leave it in the background session.

### **QA Test Impact Analysis**
| Source Component | QA Test Path (QEI-AUTOMATION) | Test Category | Confidence |
| :--- | :--- | :--- | :--- |
| `[File Path]` | `src/tests/[Folder]/[File]` | e.g., Staging / WidgetChild | [High/Med/Low] |

### **Coverage & Risk Assessment**
- **Coverage Gap:** If no match is found in `QEI-AUTOMATION/src/tests`, you MUST explicitly state: "No automation found in QEI-AUTOMATION."
- **Failure Intent:** If the test is designed to fail (like `new test.java`), warn that it will break CI.
