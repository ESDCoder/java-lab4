{
  description = "Development environment for JavaFX project";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };

  outputs = { self, nixpkgs }:
  let
    system = "x86_64-linux";
    pkgs = import nixpkgs { inherit system; };
  in {
    devShells.${system}.default = pkgs.mkShell {
      packages = with pkgs; [
        jdk21
        maven
        gtk3
        libxxf86vm
        libGL
        libxtst
        libx11
        zlib
        glib
      ];
      LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath [
        pkgs.gtk3
        pkgs.libxxf86vm
        pkgs.libGL
        pkgs.libxtst
        pkgs.libx11
        pkgs.zlib
        pkgs.glib
      ];
    };
  };
}
