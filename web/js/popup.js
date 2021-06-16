const linksPopup = document.querySelectorAll(".linkPopup");
for (let i = 0; i < linksPopup.length; i++) {
    linksPopup[i].addEventListener('click', function (e) {
        let contenu_name = e.currentTarget.dataset.contenu;
        document.getElementById("stade_infos_"+contenu_name).style.display="block";
    });
}


