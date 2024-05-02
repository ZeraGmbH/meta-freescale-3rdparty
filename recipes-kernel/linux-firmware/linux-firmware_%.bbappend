# Support additional firmware for WiLink8 modules
# TIInit_11.8.32.bts is required for bluetooth support but this particular
# version is not available in the linux-firmware repository.
#
SRC_URI_append_imx6qdl-variscite-som = "\
    https://git.ti.com/ti-bt/service-packs/blobs/raw/3aa1d75f3c2ae77f6e4d36194e3d281b899ab149/initscripts/TIInit_11.8.32.bts;name=TIInit_11.8.32 \
"
SRC_URI[TIInit_11.8.32.md5sum] = "9fde54d4c86dee4b31e07252bb7cff06"
SRC_URI[TIInit_11.8.32.sha256sum] = "3e5fd8e12f2665914b9da8d70e4cad3dcd8a9cf09eb130218405dc5c6bbbc563"

do_install_append_imx6qdl-variscite-som() {
    cp ${WORKDIR}/TIInit_11.8.32.bts ${D}/lib/firmware/ti-connectivity/
}

PACKAGE_ARCH_imx6qdl-variscite-som = "${MACHINE_ARCH}"
