# Gdzie moj stop

The name of the app can be translated to `Where is my bus stop?` or in German `Wo ist meine Bushaltestelle?` 
It reads from Szczecin bus transportation Zditm <https://www.zditm.szczecin.pl/pl> API and device GPS location to find the nearest bus stop and display its schedule.
The goal is to keep it simple. Only the chosen by the user bus stops will be displayed. It enables users to check the nearest bus and the departure time without unnecessary struggle or delay.
The app will be available in three languages Polish, English, and German

## Repository

### Branch

Each branch should be associated with a team member and corresponding issue.
To accomplish that, use the following template `acronym/issue_number/description`, for example:
> feature/1/initial-project  or feature/epic-2/1/initial-project

Where:

- `type of the push` – feature or bug,
- optional `Epic and epic issue` - for bigger tasks an epic issue is going to be created that combines more issues
- `issue_number` – number preceded by a slash character for a particular issue,
- `description` – the name of the issue

### Commit

Similarly, to keep a bidirectional history, each commit should be associated with the corresponding issue,
so the template is following `#issue_number description`, example:
> #1 initial project

### Pull Requests

- Pull Request title should be the same as the commit message
- Only one commit should be present in one Pull Request
- Progress not perfection. In the review, we suggest what can be improved. If the issue does not affect the functionality it is up to the owner of the PR if he wants to implement it.
