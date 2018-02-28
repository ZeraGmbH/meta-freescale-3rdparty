# Copyright (C) 2013-16 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(mx6)"

SRCBRANCH = "imx_4.9.88_2.0.0_ga-var01"
SRCREV = "4757707e0c300fd2de7c09b842f909c4a3fec052"
SRC_URI = " \
    git://github.com/varigit/linux-imx.git;protocol=git;branch=${SRCBRANCH} \
    file://0001-mxc_hdmi-mxc_hdmi-allow-EDID-to-select-non-CEA-modes.patch \
    file://0002-menuconfig-check-lxdiaglog.sh-Allow-specification-of.patch \
    file://defconfig \
"

LOCALVERSION = "-1.0.0"

KERNEL_IMAGETYPE = "uImage"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

# enable for builtin vivante kernel module
# MACHINE_USES_VIVANTE_KERNEL_DRIVER_MODULE = "0"

