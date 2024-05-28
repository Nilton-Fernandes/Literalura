package br.com.Nilton.Literalura.service;

public interface IDataConverter{
    <T> T getData(String json, Class<T> classe);
}