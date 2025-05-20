# import PyPDF2
# from docx import Document
# from pptx import Presentation
# For pdf only reading text from the files
# with open('test.pdf', 'rb') as file:
#     reader = PyPDF2.PdfReader(file)

#     pdf_text = ''
#     for page in reader.pages:
#         pdf_text += page.extract_text()

# For txt files only reading text from the file
# with open('test.txt', "r", encoding="utf-8") as f:
#     text = f.read()

# For docx files only reading text from the files
# doc = Document('test.docx')
# text = "\n".join([para.text for para in doc.paragraphs])

# For the ppt files only reading text from the files
# prs = Presentation('test.pptx')
# text = []
# for slide in prs.slides:
#     for shape in slide.shapes:
#         if hasattr(shape, "text"):
#             text.append(shape.text)
# text = "\n".join(text)

# print(text)
