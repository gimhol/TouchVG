# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

include_directories(
                        ../core/include
                        ../core/include/geom
                        ../core/include/graph
                        ../core/include/canvas
                        ../core/include/export
                        ../core/include/shape
                        ../core/include/gshape
                        ../core/include/storage
                        ../core/include/cmd
                        ../core/include/cmdbase
                        ../core/include/cmdobserver
                        ../core/include/test
                        ../core/include/view
                        ../core/src/view
                        ../core/include/record
                        ../core/include/cmdbasic
                        ../core/include/cmdmgr
                        ../core/include/jsonstorage
                        ../core/include/shapedoc
                    )

add_library( # Sets the name of the library.
             touchvg

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/touchvg_java_wrap.cpp

             ../core/src/cmdbase/mgcmddraw.cpp
             ../core/src/cmdbase/mgdrawarc.cpp
             ../core/src/cmdbase/mgdrawline.cpp
             ../core/src/cmdbase/mgdrawrect.cpp

             ../core/src/cmdbasic/cmdbasic.cpp
             ../core/src/cmdbasic/mgcmderase.cpp
             ../core/src/cmdbasic/mgdrawcircle.cpp
             ../core/src/cmdbasic/mgdrawdiamond.cpp
             ../core/src/cmdbasic/mgdrawellipse.cpp
             ../core/src/cmdbasic/mgdrawfreelines.cpp
             ../core/src/cmdbasic/mgdrawgrid.cpp
             ../core/src/cmdbasic/mgdrawlines.cpp
             ../core/src/cmdbasic/mgdrawparallel.cpp
             ../core/src/cmdbasic/mgdrawpolygon.cpp
             ../core/src/cmdbasic/mgdrawsplines.cpp
             ../core/src/cmdbasic/mgdrawsquare.cpp
             ../core/src/cmdbasic/mgdrawtriang.cpp

             ../core/src/cmdmgr/cmdsubject.cpp
             ../core/src/cmdmgr/mgactions.cpp
             ../core/src/cmdmgr/mgcmdmgr_.cpp
             ../core/src/cmdmgr/mgcmdmgr2.cpp
             ../core/src/cmdmgr/mgcmdselect.cpp
             ../core/src/cmdmgr/mgsnapimpl.cpp

             ../core/src/export/girecordcanvas.cpp
             ../core/src/export/simple_svg.hpp
             ../core/src/export/svgcanvas.cpp

             ../core/src/geom/fitcurves.cpp
             ../core/src/geom/mgbase.cpp
             ../core/src/geom/mgbox.cpp
             ../core/src/geom/mgcurv.cpp
             ../core/src/geom/mglnrel.cpp
             ../core/src/geom/mgmat.cpp
             ../core/src/geom/mgnear.cpp
             ../core/src/geom/mgnearbz.cpp
             ../core/src/geom/mgpath.cpp
             ../core/src/geom/mgpnt.cpp
             ../core/src/geom/mgvec.cpp
             ../core/src/geom/nanosvg.cpp

             ../core/src/graph/gigraph.cpp
             ../core/src/graph/gixform.cpp

             ../core/src/gshape/mgarc.cpp
             ../core/src/gshape/mgarccross.cpp
             ../core/src/gshape/mgbasesp.cpp
             ../core/src/gshape/mgcshapes.cpp
             ../core/src/gshape/mgdiamond.cpp
             ../core/src/gshape/mgdot.cpp
             ../core/src/gshape/mgellipse.cpp
             ../core/src/gshape/mggrid.cpp
             ../core/src/gshape/mgline.cpp
             ../core/src/gshape/mglines.cpp
             ../core/src/gshape/mgparallel.cpp
             ../core/src/gshape/mgpathsp.cpp
             ../core/src/gshape/mgrdrect.cpp
             ../core/src/gshape/mgrect.cpp
             ../core/src/gshape/mgsplines.cpp

             ../core/src/jsonstorage/mgjsonstorage.cpp

             ../core/src/record/recordshapes.cpp
             ../core/src/shape/mgbasicspreg.cpp
             ../core/src/shape/mgcomposite.cpp
             ../core/src/shape/mgimagesp.cpp
             ../core/src/shape/mgshape.cpp
             ../core/src/shape/mgshapes.cpp

             ../core/src/shapedoc/mglayer.cpp
             ../core/src/shapedoc/mgshapedoc.cpp
             ../core/src/shapedoc/spfactoryimpl.cpp

             ../core/src/test/RandomShape.cpp
             ../core/src/test/testcanvas.cpp

             ../core/src/view/GcGraphView.cpp
             ../core/src/view/GcMagnifierView.cpp
             ../core/src/view/GcShapeDoc.cpp
             ../core/src/view/gicorerecord.cpp
             ../core/src/view/gicoreview.cpp
             ../core/src/view/gimousehelper.cpp
             )


# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       touchvg

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )
