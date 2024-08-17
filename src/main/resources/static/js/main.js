// JavaScript для вращения изображения
const floatingImage = document.querySelector('.floating-image');

floatingImage.addEventListener('mouseover', () => {
    floatingImage.classList.add('rotate');
});

floatingImage.addEventListener('mouseout', () => {
    floatingImage.classList.remove('rotate');
});