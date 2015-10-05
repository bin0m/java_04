<!-- doc.py -->
Using implicity navigation, this request come from /projects/show.xhtml and directs to /project/edit.xhtml
Using implicity navigation, this request come from /projects/show.xhtml and directs to /project/show.xhtml
could be null instead
Implicity navigation, this request come from /projects/edit.xhtml and directs to /project/show.xhtml
Implicity navigation, this request come from /projects/show.xhtml and directs to /project/showSprints.xhtml
[src/main/java/jsf2/demo/scrum/web/controller/ProjectManager.java](src/main/java/jsf2/demo/scrum/web/controller/ProjectManager.java)

Verify if the currentProject is out of date
If there is a new CurrentProject we need to update sprintList and set currentSprint to null and tell user he/she needs to select a Sprint
[src/main/java/jsf2/demo/scrum/web/controller/SprintManager.java](src/main/java/jsf2/demo/scrum/web/controller/SprintManager.java)

will call the postConstruct method.
will call the preDestroy method.
[src/main/java/jsf2/demo/scrum/web/scope/TaskScope.java](src/main/java/jsf2/demo/scrum/web/scope/TaskScope.java)

looking for bean in scope already created.
looking for custom scope in the session
if doesn't exists create and put it in the session
looking for mbean in taskScope
remove scope from the session
[src/main/java/jsf2/demo/scrum/web/scope/TaskScopeResolver.java](src/main/java/jsf2/demo/scrum/web/scope/TaskScopeResolver.java)

