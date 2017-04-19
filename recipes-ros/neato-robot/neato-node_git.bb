DESCRIPTION = "A node wrapper for the neato_driver package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

RDEPENDS_${PN} = "rospy neato-driver sensor-msgs geometry-msgs nav-msgs tf"

require neato-robot.inc
