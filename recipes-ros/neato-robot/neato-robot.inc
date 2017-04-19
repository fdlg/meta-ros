SRC_URI = "git://github.com/Birkehoj/${ROS_SPN}.git;protocol=https;branch=hydro-devel"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "neato_robot"
