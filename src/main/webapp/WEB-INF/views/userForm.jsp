<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${user.id == null ? 'Add' : 'Edit'} User</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@1.0.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<div class="container mx-auto mt-10">
    <h1 class="text-2xl font-bold">${user.id == null ? 'Add' : 'Edit'} User</h1>
    <form action="${pageContext.request.contextPath}/users${user.id == null ? '' : '/update'}" method="post" class="mt-4">

    <input type="hidden" name="id" value="${user.id}"/>

        <div class="mb-4">
            <label class="block text-gray-700">First Name:</label>
            <input type="text" name="firstName" value="${user.firstName}" required class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <div class="mb-4">
            <label class="block text-gray-700">Last Name:</label>
            <input type="text" name="lastName" value="${user.lastName}" required class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <div class="mb-4">
            <label class="block text-gray-700">Identification Number:</label>
            <input type="text" name="identificationNumber" value="${user.identificationNumber}" class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <div class="mb-4">
            <label class="block text-gray-700">Nationality:</label>
            <input type="text" name="nationality" value="${user.nationality}" class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <div class="mb-4">
            <label class="block text-gray-700">Registration Date:</label>
            <input type="date" name="registrationDate" value="${user.registrationDate}" class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <div class="mb-4">
            <label class="block text-gray-700">Expiration Date:</label>
            <input type="date" name="expirationDate" value="${user.expirationDate}" class="border border-gray-300 rounded px-4 py-2 w-full" />
        </div>

        <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded">Save</button>
        <a href="/users" class="bg-gray-500 text-white px-4 py-2 rounded ml-2">Cancel</a>
    </form>
</div>
</body>
</html>
