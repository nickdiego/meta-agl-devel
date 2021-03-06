## Introduction

The `meta-agl-devel` layer contains components that are being tested or
still in development.
The layer also contains software packages that Original Equipment
Manufacturers (OEMs) need but are not included in the AGL software.

## Sub-Layers

The `meta-agl-devel` layer contains the following files and sub-layers:

```
.
├── meta-agl-telemetry
├── meta-audio-4a-framework
├── meta-audio-soundmanager-framework
├── meta-egvirt
├── meta-gstrecorder-rcar-gen3
├── meta-hmi-framework
├── meta-oem-extra-libs
├── README.md
├── templates
```

The following list provides a summary of these sub-layers:

* `meta-agl-telemetry`: Provides the smallest AGL image.
  The image is designed to be used when a device requires restricted
  scope of responsibilites (e.g. collecting vehicle telemetry).

* `meta-audio-4a-framework`: A collection of recipes used for the
  first integration of 4A (i.e. Advanced AGL Audio Architecture).

  **NOTE:** Recipes from this layer will be integrated into the
  `meta-agl` layer in the future.

* `meta-audio-soundmanager-framework`: Supports the Soundmanager
  Audio Framework features, which maps to the `agl-audio-soundmanager-framework`
  AGL feature.

* `meta-egvirt`: The AGL Virtualization Expert Group (EG-VIRT) layer.
  This layer supports the design, test, implementation, and assessment
  of virtualization technologies (e.g. containers, hypervisors, system
  partitioners, and so forth) aimed at AGL ARMv8 and Intel platforms.

* `meta-gstrecorder-rcar-gen3`: Supports streaming audio and video for
  the Pro and Premier board kits (e.g.
  [Renesas R-Car Starter Kit Pro Board](https://www.elinux.org/R-Car/Boards/M3SK)
  and
  [Renesas R-Car Starter Kit Premier Board](https://www.elinux.org/R-Car/Boards/H3SK)).

* `meta-hmi-framework`: Provides AGL's Human Machine Interface (HMI) framework
  through resource management consisting of sounds, windows, and input control.
  For more information, see the
  [HMI-Framework Page](https://wiki.automotivelinux.org/hmiframework) of the
  AGL Wiki.

* `meta-oem-extra-libs`: Provides libraries and software packages needed by
  OEMs but not provided by the AGL software.

* `templates`: Feature templates that support the `meta-agl-devel` layer.

## Additional Sub-Layer Information

This section provides additional information for the `meta-egvirt`,
`meta-oem-extra-libs`, and `meta-hmi-framework` layers.

### Virtualization Support

The `meta-egvirt` layer enables virtualization support in AGL.
The AGL Virtualization Expert (EG-VIRT) group is responsible
for design and implementation of AGL virtualization solutions
(.e.g the Virtualization platform architecture of AGL).
You can read about EG-VERT's efforts on the
"[Virtualization Expert Group's](https://wiki.automotivelinux.org/eg-virt)"
page of the AGL wiki.

Additionally, you can learn more about virtualization as it applies to AGL
by reading
"[The Automotive Grade Linux Software Defined Connected Car Architecture](https://www.automotivelinux.org/wp-content/uploads/sites/4/2018/06/agl_software_defined_car_jun18.pdf)"
whitepaper.

### OEM Extra Libraries

The `meta-oem-extra-libs` layer provides additional software packages many OEMs need
but are not part of the AGL source.
Following is the list of packages this layer provides:

 * boost
 * fixesproto
 * imagemagick
 * iptables
 * Xorg-macros
 * zlib
 * eglibc = glibc
 * libcurl
 * libgif
 * libneon
 * mongoose
 * fuse
 * protocol buffers
 * bsdiff
 * module-init-tools
 * libcroco
 * libtiff
 * librsvg
 * libpcap

To add these packages to your library, you need to include the
`agl-oem-extra-libs` AGL feature when you initialize your build
environment using the `aglsetup.sh` script.

For information on how to use the `aglsetup.sh` script to initialize
your build environment, see the
"[Initializing Your Build Environment](../../../../getting_started/en/dev/reference/image-workflow-initialize-build-environment.html)"
section.

Once you have included the AGL feature, you can build your image.

### HMI Framework

The `meta-hmi-framework` layer supports the Human-Machine Interface (HMI) Framework.
The HMI-Framework is the User Interface (UI) to control the Infotainment System.
Work continues to close the gap between the user experience of a smart phone
and the Infotainment System in a vehicle, for example.

You can find more out about HMI Framework progress on the
"[HMI Framework](https://wiki.automotivelinux.org/hmiframework)" page on the AGL Wiki.

To add HMI Framework support to your image, you need to include the
`hmi-framework` AGL feature when you initialize your build
environment using the `aglsetup.sh` script.

For information on how to use the `aglsetup.sh` script to initialize
your build environment, see the
"[Initializing Your Build Environment](../../../../getting_started/en/dev/reference/image-workflow-initialize-build-environment.html)"
section.

Once you have included the AGL feature, you can build your image.
