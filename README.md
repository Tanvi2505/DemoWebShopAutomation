# Demo Web Shop Test Automation Framework

An automated UI regression suite built for the [Demo Web Shop](https://demowebshop.tricentis.com/) web application using **Java**, **Selenium WebDriver**, and **TestNG**.

---

## 📌 Project Overview

This repository contains an end-to-end automation testing suite structured around an inheritance-based framework architecture. It provides cross-browser execution, automated authentication hooks, and functional UI regression coverage for standard e-commerce customer flows.

### Key Highlights:
- **Centralized Test Configuration:** Base test class managing browser lifecycles (`@BeforeClass` / `@AfterClass`) and timeouts.
- **Cross-Browser Support:** Parameterized setup supporting Chrome (Incognito), Firefox, Edge, and Safari via TestNG XML configuration.
- **Group-Based Authentication Hooks:** Automated login workflow executed prior to targeted tests via `@BeforeMethod(onlyForGroups = {"perform"})` and clean session teardown via `@AfterMethod`.
- **E-Commerce End-to-End Coverage:** Sanity navigation, positive/negative login verification, product search, cart addition, and cart removal.

---

## 🛠️ Tech Stack & Tools

| Component | Technology |
| :--- | :--- |
| **Language** | Java (JDK 11+) |
| **Automation Tool** | Selenium WebDriver (4.x) |
| **Test Framework** | TestNG |
| **Build & Dependency Tool** | Apache Maven |
| **Design Architecture** | Inheritance-Based Test Framework |
| **Version Control** | Git & GitHub |

---

## 📁 Repository Structure

```text
DemoWebShopAutomation/
├── pom.xml                               # Maven project dependencies and build configuration
├── testng.xml                            # TestNG suite runner and cross-browser parameter definition
├── README.md                             # Project documentation
└── src/
    └── test/
        └── java/
            ├── com/demowebshop/base/
            │   └── BaseTest.java         # WebDriver setup, cross-browser config, login/logout hooks
            └── DwsTestClass/
                ├── HomePage.java         # UI verification and link validation test cases
                ├── Login.java            # Positive and negative authentication tests
                └── ShoppingCart.java     # Product search, cart addition, and item removal tests
