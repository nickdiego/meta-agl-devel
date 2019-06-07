SUMMARY     = "AGL configuration file for pipewire"
HOMEPAGE    = "https://pipewire.org"
BUGTRACKER  = "https://jira.automotivelinux.org"
AUTHOR      = "George Kiagiadakis <george.kiagiadakis@collabora.com>"
SECTION     = "multimedia"

LICENSE = "MIT"

SRC_URI = " \
 file://pipewire.conf \
 "

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    # if we are distributing our own configuration file,
    # replace the one installed by pipewire
    install -d ${D}/${sysconfdir}/pipewire/
    install -m 0644 ${WORKDIR}/pipewire.conf ${D}${sysconfdir}/pipewire/pipewire.conf
}

FILES_${PN} = "\
    ${sysconfdir}/pipewire/pipewire.conf \
"
CONFFILES_${PN} += "\
    ${sysconfdir}/pipewire/pipewire.conf \
"

RPROVIDES_${PN} += "virtual/pipewire-config"
