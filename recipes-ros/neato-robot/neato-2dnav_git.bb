DESCRIPTION = "Configuration and launch files for using the navigation stack with the Neato XV-11 robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

RDEPENDS_${PN} = "neato-node"

require neato-robot.inc
