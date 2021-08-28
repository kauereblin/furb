class ParableEquation():
  def __init__(self, x1, y1, x2, y2, x3, y3):
    self.x1 = x1
    self.y1 = y1
    self.x2 = x2
    self.y2 = y2
    self.x3 = x3
    self.y3 = y3

    self.a = 0
    self.b = 0
    self.c = 0

    self.matrixY = []
    self.standard_matrix = []
    self.determinant_matrix = [[0, 0, 0, 0, 0],
                               [0, 0, 0, 0, 0],
                               [0, 0, 0, 0, 0]]

    self.setup()


  def setup(self):
    self.standard_matrix.append([self.x1 ** 2, self.x1, 1, self.x1 ** 2, self.x1])
    self.standard_matrix.append([self.x2 ** 2, self.x2, 1, self.x2 ** 2, self.x2])
    self.standard_matrix.append([self.x3 ** 2, self.x3, 1, self.x3 ** 2, self.x3])

    self.matrixY = [self.y1, self.y2, self.y3]


  def equal_matrices(self):
    for row in range(3):
      for col in range(5):
        self.determinant_matrix[row][col] = self.standard_matrix[row][col]


  def calculate_determinant(self):
    determinant = (self.determinant_matrix[0][0] * self.determinant_matrix[1][1] * self.determinant_matrix[2][2] +
                   self.determinant_matrix[0][1] * self.determinant_matrix[1][2] * self.determinant_matrix[2][3] +
                   self.determinant_matrix[0][2] * self.determinant_matrix[1][3] * self.determinant_matrix[2][4]) -\
                  (self.determinant_matrix[0][2] * self.determinant_matrix[1][1] * self.determinant_matrix[2][0] +
                   self.determinant_matrix[0][3] * self.determinant_matrix[1][2] * self.determinant_matrix[2][1] +
                   self.determinant_matrix[0][4] * self.determinant_matrix[1][3] * self.determinant_matrix[2][2])

    return determinant


  def build_function(self):
    self.equal_matrices()
    D = self.calculate_determinant()

    self.equal_matrices()
    self.determinant_matrix[0][0] = self.matrixY[0]
    self.determinant_matrix[1][0] = self.matrixY[1]
    self.determinant_matrix[2][0] = self.matrixY[2]
    self.determinant_matrix[0][3] = self.matrixY[0]
    self.determinant_matrix[1][3] = self.matrixY[1]
    self.determinant_matrix[2][3] = self.matrixY[2]
    Da = self.calculate_determinant()

    self.equal_matrices()
    self.determinant_matrix[0][1] = self.matrixY[0]
    self.determinant_matrix[1][1] = self.matrixY[1]
    self.determinant_matrix[2][1] = self.matrixY[2]
    self.determinant_matrix[0][4] = self.matrixY[0]
    self.determinant_matrix[1][4] = self.matrixY[1]
    self.determinant_matrix[2][4] = self.matrixY[2]
    Db = self.calculate_determinant()

    self.equal_matrices()
    self.determinant_matrix[0][2] = self.matrixY[0]
    self.determinant_matrix[1][2] = self.matrixY[1]
    self.determinant_matrix[2][2] = self.matrixY[2]
    Dc = self.calculate_determinant()

    if D != 0:
      self.a = Da / D
      self.b = Db / D
      self.c = Dc / D


  def define_equation(self):
    print(f"f(x) = {self.a} * x² {'' if self.b < 0 else '+'} {self.b} * x {'' if self.c < 0 else '+'} {self.c}")
