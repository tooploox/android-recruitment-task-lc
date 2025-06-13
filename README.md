# Android Developer - Recruitment Task
## Song App

In this repo you will find a basic Android application. It's very simple and does one job - fetch a list of songs from remote data source and display the data.

Please, familiarize yourself with this repository.

We're aware that the quality of the prepared code is not the best - it's on purpose.

## ⚠️ Pre-Interview Code Review (Required)

**Important:** Please perform a quick code review of this Android project before the interview. This is crucial for conducting the interview smoothly.

**Instructions:** Your task is to perform a code review to identify bugs, code quality issues, and areas for improvement. **You are not expected to write perfect, production-ready fixes.** The goal is to see how you identify and communicate problems.

On GitHub, you can only comment on lines within files that have been modified in your Pull Request. Therefore, please follow these steps:

1.  Create a new branch (e.g., `review/your-name`).
2.  For each file you want to comment on, you have three options:
    * **a) Make the actual fix,** if you believe it's quick and simple.
    * **b) Make a small, neutral change** (like adding an empty line or a space) just to make the file appear in the Pull Request's diff.
    * **c) Add a descriptive comment directly in the code** (e.g., using `// FIXME:` or `// TODO:`) to mark the issue.
3.  When you are ready, open a **Draft Pull Request** with your changes.
4.  In the PR's "Files changed" tab, **add your comments** next to the relevant lines, explaining the issue or your proposed solution.
5.  For high-level, architectural feedback, please use the main **description area of the Pull Request**.

We'll discuss your findings during the interview and then proceed with implementing fixes and new features together.

**Time needed:** This task is designed to be completed within **15-30 minutes** maximum.

## The App

Currently, the application fetches a list of songs from a remote data source and displays it. We've also prepared an embedded JSON file in this repository which could be used as a second data source.

## Technical Interview

During our technical interview, you will be asked to do some tasks which will improve overall quality and health of this codebase.

We are huge fans of Clean Architecture and you should be prepared for questions related to:
- dependency injection
- introducing abstraction to a given problem
- adding multiple data sources
- refactoring the existing codebase
- testing

We also love a nice and polished User Interface and we would like to see some of your skills in this area.

## Expectations

You should pay attention to the architecture of the app and the usage of design patterns and data structures.

You should write example unit tests to show that your solution is testable.

You should explain not only what you're doing but also why you're doing something in a given fashion.

## Tips

App code should be idiomatic - we love Kotlin and we want to see that you do too.

App code should be tested or at least testable.

It's easier to read the code when it's well formatted and the code style is consistent.

Feel free to use any tools you normally would, including AI assistants. We want to see how you work with them. Please talk through your process: what you're asking AI, why you're choosing that approach, and how you're validating the results.