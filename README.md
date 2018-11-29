Deploy code to server

1. Setup environment in server
	+ Intall Java v.1.8
	+ Intall Tomcat 9

2. Deploy code
	
	+ Step 1: In IDE (Eclipse) build file .war in project
	+ Step 2: Rename file .war to ROOT.war
	+ Step 3: Copy file ROOT.war to folder config tomcat (Ex: /opt/tomcat/webapps)
			  or config a link in tomcat to deploy code "domain/manager" -> config file /tomcat/conf/tomcat-users.xml
			  "<user username="admin" password="tomcat" roles="manager-gui"/>"
