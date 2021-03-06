SUMMARY     = "High level voice service binding"
DESCRIPTION = "agl-service-voice-high is the binding library"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/apps/agl-service-voice-high"
SECTION     = "apps"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://License.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-service-voice-high;protocol=https;branch=${AGL_BRANCH}"
SRCREV = "b6abca2edcb36c0c0848d1cd8dc291f23293aa80"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

inherit cmake aglwgt

DEPENDS += "json-c systemd af-binder glib-2.0 lua"