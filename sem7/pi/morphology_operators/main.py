from matplotlib import pyplot as plt
import cv2
import numpy as np

INPUT_IMAGE = "mama6"

if __name__ == "__main__":
    img = cv2.imread(f"./assets/{INPUT_IMAGE}.png", 0)
    kernel = np.ones((5,5), np.uint8)

    tophat = cv2.morphologyEx(img, cv2.MORPH_TOPHAT, kernel)
    plt.imshow(tophat, cmap='grey')

    (T, bin) = cv2.threshold(tophat, (20 if (cv2.minMaxLoc(tophat)[1] - 100) <= 20 else (cv2.minMaxLoc(tophat)[1] - 100)), 255, cv2.THRESH_BINARY)
    plt.imshow(bin, 'gray')
    plt.title('Non-flat SE binary thresholded')
    plt.show()

    cv2.imwrite(f"./assets/{INPUT_IMAGE}_processed.png", bin)
