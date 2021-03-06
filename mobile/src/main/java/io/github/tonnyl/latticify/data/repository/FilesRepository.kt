package io.github.tonnyl.latticify.data.repository

import io.github.tonnyl.latticify.data.FileListWrapper
import io.github.tonnyl.latticify.data.FileWrapper
import io.github.tonnyl.latticify.data.ResponseWrapper
import io.github.tonnyl.latticify.data.datasource.FilesDataSource
import io.github.tonnyl.latticify.retrofit.RetrofitClient
import io.github.tonnyl.latticify.retrofit.service.FilesService
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody

/**
 * Created by lizhaotailang on 30/12/2017.
 */
class FilesRepository : FilesDataSource {

    private val mFilesService = RetrofitClient.createService(FilesService::class.java)
    private val mToken = RetrofitClient.mToken

    override fun delete(fileId: String): Observable<ResponseWrapper> {
        return mFilesService.delete(mToken, fileId)
    }

    override fun info(fileId: String, count: Int, page: Int): Observable<FileWrapper> {
        return mFilesService.info(mToken, fileId, count, page)
    }

    override fun list(channelId: String, count: Int, page: Int, tsFrom: Long, tsTo: Long, types: String, userId: String): Observable<FileListWrapper> {
        return mFilesService.list(mToken, channelId, count, page, tsFrom, tsTo, types, userId)
    }

    override fun revokePublicURL(fileId: String): Observable<FileWrapper> {
        return mFilesService.revokePublicURL(mToken, fileId)
    }

    override fun sharedPublicURL(fileId: String): Observable<FileWrapper> {
        return mFilesService.sharedPublicURL(mToken, fileId)
    }

    override fun upload(channels: RequestBody, content: RequestBody?, file: MultipartBody.Part?, filename: RequestBody, fileType: RequestBody, initialComment: RequestBody, title: RequestBody): Observable<FileWrapper> {
        return mFilesService.upload(RequestBody.create(MediaType.parse("text/plain"), mToken), channels, content, file, filename, fileType, initialComment, title)
    }

}