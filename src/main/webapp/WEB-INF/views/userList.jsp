<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>User List</title>
  <link href="https://cdn.jsdelivr.net/npm/tailwindcss@1.0.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
<div class="container mx-auto p-4">
  <h1 class="text-2xl font-bold mb-4">Users</h1>
  <a href="${pageContext.request.contextPath}/users/new" class="bg-blue-500 text-white px-4 py-2 rounded">Add User</a>

  <table class="min-w-full divide-y divide-gray-200 mt-4">
    <thead class="bg-gray-100">
    <tr>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">ID</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">First Name</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Last Name</th>
      <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Actions</th>
    </tr>
    </thead>
    <tbody class="bg-white divide-y divide-gray-200">
    <c:forEach var="user" items="${users}">
      <tr>
        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-900">${user.id}</td>
        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-900">${user.firstName}</td>
        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-900">${user.lastName}</td>
        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-900">
          <a href="${pageContext.request.contextPath}/users/edit/${user.id}" class="text-blue-600 hover:text-blue-900">Edit</a>
          <a href="${pageContext.request.contextPath}/users/delete/${user.id}" class="text-red-600 hover:text-red-900 ml-4">Delete</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
